// import

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {

    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;
        int matrixWidth = 3;
        int matrixHeight = 3;

        BufferedImage imageCopy = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster rasterCopy = imageCopy.getRaster();
        // создаем массив, в котором будет содержаться текущий пиксель
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        // создание матрицы для хранения необходимого эффекта
        double[][] matrixBlur = new double[matrixWidth][matrixHeight];
        // заполнение матрицы
        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixHeight; j++) {
                matrixBlur[i][j] = (double) 1 / 9;
            }
        }
        // цикл по строкам картинки
        for (int j = 1; j < height - 1; ++j) {
            // цикл пикселям строки
            for (int i = 1; i < width - 1; ++i) {
                // получаем текущий пиксель с координатами i,j
                rasterCopy.getPixel(i, j, pixel);

                double r = 0;
                double g = 0;
                double b = 0;

                int index1 = 0;
                for (int m = j - 1; m <= j + 1; ++m) {
                    int index2 = 0;
                    for (int n = i - 1; n <= i + 1; ++n) {
                        raster.getPixel(n, m, pixel);

                        r += matrixBlur[index1][index2] * pixel[0];
                        if (r < 0) {
                            r = 0;
                        } else if (r > 255) {
                            r = 255;
                        }
                        g += matrixBlur[index1][index2] * pixel[1];
                        if (g < 0) {
                            g = 0;
                        } else if (g > 255) {
                            g = 255;
                        }
                        b += matrixBlur[index1][index2] * pixel[2];
                        if (b < 0) {
                            b = 0;
                        } else if (b > 255) {
                            b = 255;
                        }
                        index2++;
                    }
                    index1++;
                }
                pixel[0] = (int) r;
                pixel[1] = (int) g;
                pixel[2] = (int) b;

                raster.setPixel(i, j, pixel);
            }
        }

        ImageIO.write(image, "png", new File("out.png"));
    }
}