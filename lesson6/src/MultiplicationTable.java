//пока без форматирования
public class MultiplicationTable {
    public static void main(String[] args) {
        int[] array = getArray(12);

        for (int i = 0; i < array[array.length - 1]; i++) {
            System.out.print(System.lineSeparator());
            for (int j = 0; j < array[array.length - 1]; j++) {
                int composition = array[i] * array[j];
                System.out.printf("%4d",composition);
            }
        }
    }

    private static int[] getArray(int countElements) { //Задание массива от 1 до countElements
        int[] numberArray = new int[countElements];
        for (int i = 0; i < countElements; i++) {
            numberArray[i] = i + 1;
        }
        return numberArray;
    }
}