//1. Это лучше не делать в общем цикле
//http://joxi.ru/brR8OX6TJ1zj12
//Все равно это делается 1 раз, и после печати первой строки.+
//В цикле внизу, про общую часть таблицы, можно так же упростить
//2. Сейчас нет одной строки и одного столбца в таблице
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 7;

        for (int i = 0; i <= tableSize; i++) {
            System.out.printf("%2d%s", i, " |");
        }
        System.out.println();
        for (int i = 0; i <= tableSize; i++) {
            if (i == 0) {
                System.out.print("---|");
            } else {
                System.out.print("----");
            }
        }
        for (int i = 1; i <= tableSize; i++) {
            System.out.println();
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                if (j == 1) {
                    System.out.printf("%2d%s", composition, " |");
                } else {
                    System.out.printf("%3d%s", composition, " ");
                }
            }
        }
    }
}