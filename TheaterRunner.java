import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create any 2D arrays & variables to be passed as parameters to constructor

 ImageFilter[][] images = {
      // row 0 --> baseball
      { new ImageFilter("IMG_2144.JPEG"), new ImageFilter("IMG_4207.jpeg"), new ImageFilter("IMG_2172.JPEG"), null },
      // row 1 --> views
      { new ImageFilter("IMG_4049.jpg"), new ImageFilter("IMG_3940.jpeg"), new ImageFilter("IMG_4028.jpeg"),  new ImageFilter("IMG_4226.jpeg") },
      // row 2 --> friends
      { new ImageFilter("9B02F426-ADB8-40A2-AA67-480B1175DEC6.JPG"), new ImageFilter("IMG_3675.jpg"), new ImageFilter("IMG_4069.jpeg"), new ImageFilter("IMG_6121.jpeg")  },
    };


    int[][] topSpeed = {
  // Fastball
  {75, 85},
  // Sinker
  {70, 78},
  // Curveball
  {68, 72}
};
    
    // Instantiate Scene subclass objects
    SceneOne scene1 = new SceneOne(images);
    SceneTwo scene2 = new SceneTwo(topSpeed);
   
    // Call drawScene methods in each subclass
    scene1.drawScene();
    scene2.drawScene();
   
    // Play scenes in Theater, in order of arguments
    Theater.playScenes(scene1, scene2);
   
  }
}