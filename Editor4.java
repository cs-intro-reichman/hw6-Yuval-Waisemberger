import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name of the PPM file
 * of a source image that will morph into grayscaled version of itself, and the number of morphing steps required in an Integer. 
 * For example, to morph the ironmen.ppm into a grayscaled version off itself in 24 steps,  we will use:
 * java Editor4 ironmen.ppm 24
 * Note: There is no need to scale the target image to the size of the source
 * image, since Runigram.morph performs this action.
 */

public class Editor4 {
    public static void main (String[] args) {
		String source = args[0];
		Color[][] sourceImage = Runigram.read(source);
		Color[][] grayImage = Runigram.grayScaled(sourceImage);
        int n = Integer.parseInt(args[1]);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, grayImage, n);
	}
}
