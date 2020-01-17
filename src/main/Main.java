package main;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecoderService decoderService = new DecoderService();

        System.out.println(decoderService.getDecodedText("АаБб..ЕеЁё..Яя", 1));
    }
}

