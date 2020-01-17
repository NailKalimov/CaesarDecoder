package main;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecoderService decoderService = new DecoderService();
        Scanner scanner = new Scanner(System.in);
        String sourceText = scanner.nextLine();
        System.out.println("Введите текст для дешифровки: ");
        for (int i = 1; i < 33; i++) {
            System.out.print("-Ключ=" + i + ": ");
            System.out.println(decoderService.getDecodedText(sourceText, i));
        }
    }
}

