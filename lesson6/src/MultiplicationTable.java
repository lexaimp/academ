//1. Вместо print separator надо вызвать println() без аргументов
//2. Надо сделать шапку таблицы
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10;

        for (int i = 1; i <= tableSize; i++) {
            System.out.print(System.lineSeparator());
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                if (i == 1) {                                  //попытка реализации форматированного вывода
                    System.out.printf("|%3d", composition);
                } else {
                    System.out.printf("%4d", composition);
                }
            }
        }
    }
}