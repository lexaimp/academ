//1. Это лучше не делать в общем цикле
//http://joxi.ru/brR8OX6TJ1zj12
//Все равно это делается 1 раз, и после печати первой строки.+
//В цикле внизу, про общую часть таблицы, можно так же упростить
//2. Сейчас нет одной строки и одного столбца в таблице
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 7;

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d%s", i, "|");
        }
        System.out.println();
        for (int i = 1; i <= tableSize; i++) {
            System.out.print("----");
        }
        for (int i = 2; i <= tableSize; i++) {
            System.out.println();
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                if (j == 1) {
                    System.out.printf("%3d%s", composition, "|");
                } else {
                    System.out.printf("%3d%s", composition, " ");
                }
            }
        }
    }
}
//       if (j == 1) {
//                    System.out.printf("%3d%s", composition, "|");
//                } else if (j == tableSize) {
//                    System.out.printf("%4d", composition);
//                    System.out.println();
//                    System.out.print("----");
//                } else {
//                    System.out.printf("%4d", composition);
//                }