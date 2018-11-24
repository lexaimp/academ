// import

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Blur {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        // создание матрицы для хранения необходимого эффекта
        double[][] matrixBlur = getMatrix(scanner.nextInt(), scanner.nextInt());

        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;
        BufferedImage imageCopy = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster rasterCopy = imageCopy.getRaster();
        // создаем массив, в котором будет содержаться текущий пиксель
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        // цикл по строкам картинки
        for (int j = 1; j < height - 1; ++j) {
            // цикл пикселям строки
            for (int i = 1; i < width - 1; ++i) {

                double r = 0;
                double g = 0;
                double b = 0;

                int index1 = 0;
                for (int m = j - 1; m <= j + 1; ++m) {
                    int index2 = 0;
                    for (int n = i - 1; n <= i + 1; ++n) {
                        raster.getPixel(n, m, pixel);

                        r += matrixBlur[index1][index2] * pixel[0];
                        g += matrixBlur[index1][index2] * pixel[1];
                        b += matrixBlur[index1][index2] * pixel[2];
                        index2++;
                    }
                    index1++;
                }
                pixel[0] = getSat(r);
                pixel[1] = getSat(g);
                pixel[2] = getSat(b);

                raster.setPixel(i, j, pixel);
            }
        }

        ImageIO.write(image, "png", new File("out.png"));
    }

    private static double[][] getMatrix(int matrixWidth, int matrixHeight) {
        double[][] matrix = new double[matrixWidth][matrixHeight];

        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixHeight; j++) {
                matrix[i][j] = (double) 1 / 9;
            }
        }
        return matrix;
    }

    private static int getSat(double component) {
        if (component < 0) {
            return 0;
        } else if (component > 255) {
            return 255;
        }
        return (int) component;
    }
}