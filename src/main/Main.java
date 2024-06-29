package main;

import interface_action.cardactionall;
import cards.necro.sceleton;
import cards.elf.archer;

public class Main {
    public static void main(String[] args) {
    cardactionall[] cards = { new sceleton(), new archer()};
    for (cardactionall card : cards) {
        card.attack();
        card.defense();
    }
        System.out.println();
    }
}