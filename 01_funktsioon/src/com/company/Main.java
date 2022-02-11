package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int worldHeight = 5;
        int worldWight = 10;
        int playerCoordinateX =(int) generateRandomCoorditane(worldWight);
        int playerCoordinateY = (int) generateRandomCoorditane(worldHeight);
        int enemyCoordinateY = (int) generateRandomCoorditane(worldHeight);
        int enemyCoordinateX = (int) generateRandomCoorditane(worldWight);

        printMap(worldHeight, worldWight,
                playerCoordinateX, playerCoordinateY,
                enemyCoordinateX, enemyCoordinateY);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            switch (input){
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
            printMap(worldHeight, worldWight,
                    playerCoordinateX, playerCoordinateY,
                    enemyCoordinateX, enemyCoordinateY);
            input = scanner.nextLine();
        }
    }
    public static int generateRandomCoorditane(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;
    }
    public static void printMap(int worldHeight, int worldWight,
                                int playerCoordinateX, int playerCoordinateY,
                                int enemyCoordinateX, int enemyCoordinateY){
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
                if (playerCoordinateY == y && playerCoordinateX == x){
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}

