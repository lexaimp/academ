//import
package it.java.academ.lesson9;

public class CountingSymbolMain {
    public static void main(String[] args) {
        CountingSymbol string = new CountingSymbol("q6we4r t54#23 24ty+ ^^");
        System.out.println("Количество букв: " + string.getCountLitters());
        System.out.println("Количество цифр: " + string.getCountDigit());
        System.out.println("Количество пробелов: " + string.getCountSpace());
        System.out.println("Количество остальных символов: " + string.getCountOther());
        string.setString("dfeAaaAfessSSSssVVvvvv");
        System.out.println("Максимальная длина подстроки, состоящая из одного и того же символа: " + string.getMaxSubstring());
    }
}
