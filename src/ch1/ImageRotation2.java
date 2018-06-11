package ch1;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageRotation2 {

	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO
				.read(new File("img/images.png"));
		int[][] imagePixels = new int[image.getWidth()][image.getHeight()];
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				imagePixels[i][j] = image.getRGB(i, j);
			}
		}

		int[][] rotatedImage = RotateImagePixels(imagePixels);

		BufferedImage newImage = new BufferedImage(image.getHeight(), image.getWidth(), ColorSpace.TYPE_RGB);
		for (int i = 0; i < newImage.getWidth(); i++) {
			for (int j = 0; j < newImage.getHeight(); j++) {
				newImage.setRGB(i, j, rotatedImage[i][j]);
			}
		}

		ImageIO.write(newImage, "jpg", new File("RotatedImage.jpg"));
	}

	private static int[][] RotateImagePixels(int[][] imagePixels) {
		int numRows = imagePixels[0].length;
		int numCols = imagePixels.length;
		int[][] newimagePixels = new int[numRows][numCols];
		int temp = 0;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				temp = imagePixels[i][j];
				imagePixels[i][j] = imagePixels[numRows-1-j][i];
			//	imagePixels[numRows-1-j][i]= temp;
			}
		}

		return imagePixels;
	}

}
