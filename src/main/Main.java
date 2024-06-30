package main;

import interface_action.cardactionall;
import cards.necro.sceleton;
import cards.elf.archer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало боя!");
        cardactionall[] cards = {new sceleton(), new archer()};
        for (int i = 0; i < cards.length; i++) {
            cardactionall current = cards[i];
            cardactionall next = cards[(i + 1) % cards.length];

            current.attack();
            next.defense();
        }
        int rows = 15;
        int cols = 18;

        char[][] board = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = ' ';

            }
        }
        placeAvatar(board, cards[0].avatar(), 2, 3); // sceleton
        placeAvatar(board, cards[1].avatar(), 5, 5); // archer
        printboard(board);
    }
    public static void placeAvatar(char[][] board, char avatar, int row, int col) {
        // Верхняя и нижняя границы
        board[row - 1][col - 1] = '_';
        board[row - 1][col] = '_';
        board[row - 1][col + 1] = '_';
        board[row + 1][col - 1] = '_';
        board[row + 1][col] = '_';
        board[row + 1][col + 1] = '_';

        // Левая и правая границы
        board[row][col - 1] = '|';
        board[row][col + 1] = '|';

        // Размещение аватара
        board[row][col] = avatar;
    }
    public static void printboard(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Верхняя граница
        for (int col = 0; col <= cols + 1; col++) {
            System.out.print("-");
        }
        System.out.println();

        // Поле с боковыми границами
        for (int row = 0; row < rows; row++) {
            System.out.print("|"); // Левая граница
            for (int col = 0; col < cols; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println("|"); // Правая граница
        }

        // Нижняя граница
        for (int col = 0; col <= cols + 1; col++) {
            System.out.print("-");
        }
    }
}