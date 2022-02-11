package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int worldHeight = 5;
        int worldWight = 10;
        char symbol;
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWight; x++) {
                if (y == 0 || y == worldHeight-1){
                    symbol = '-';
                }else if (x == 0 || x == worldWight-1){
                    symbol = '|';
                }else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    }

