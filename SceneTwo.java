import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /** Instance Variables */
  private int[][] topSpeed;
  
  /** Constructor */
  public SceneTwo(int[][] topSpeed) {
    this.topSpeed = topSpeed;
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
 public void drawScene() {
    drawText("Top Speeds: ", 80, 40);
    pause(2);

    drawSpeedStats();
  }

  public void drawSpeedStats() {
    for (int row = 0; row < topSpeed.length; row++) {
      int average = getAverageSpeed(row);
      clear("white");

      if (row == 0) {
        drawText("Fastball Speed: " + average + " MPH", 50, 200);
      } 
      else if (row == 1) {
        drawText("Sinker Speed: " + average + " MPH", 50, 200);
      } 
      else {
        drawText("Curveball Speed: " + average + " MPH", 50, 200);
      }
      pause(2);
    }
  }

  // other methods...
  public int getAverageSpeed(int row) {
    int total = 0;
    for (int col = 0; col < topSpeed[row].length; col++) {
      total += topSpeed[row][col];
    }

    return total / topSpeed[row].length;
  }
}

