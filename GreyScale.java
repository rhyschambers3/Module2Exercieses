import java.awt.*;
import java.awt.image.*;

public class GreyScale {

    static ImageTool imTool = new ImageTool ();

    public static void main (String[] argv)
    {
        // Read in an image and display.
        Image image = imTool.readImageFile ("statue.jpg");
        imTool.showImage (image, "original");

        // Convert to grey scale and display.
        Image greyImage = toGreyScale (image);
        imTool.showImage (greyImage, "grey-scale");
    }
    
    static Image toGreyScale (Image image)
    {
        // Extract pixels and size.
        int[][][] pixels = imTool.imageToPixels (image);
        int numRows = pixels.length;
        int numCols = pixels[0].length;

        // Make array of exactly the same size.
        int[][][] greyPixels = new int [numRows][numCols][4];

        // INSERT YOUR CODE HERE
        //create average value of red green blue
        for (int i = 0; i < numRows; i++){
         for (int j = 0; j < numCols; j++){
               int avg = (pixels[i][j][1] + pixels[i][j][2] + pixels[i][j][3]) / 3;
               //greyPixels at each color index equal to the average 
               greyPixels[i][j][0] = pixels[i][j][0];
               greyPixels[i][j][1] = avg;
               greyPixels[i][j][2] = avg;
               greyPixels[i][j][3] = avg;
            }
         }
	     
        Image greyImage = imTool.pixelsToImage (greyPixels);
        return greyImage;
    }
   }
   //this is einstien and it's the statue of him at the science institute
   //on Constitution Ave

