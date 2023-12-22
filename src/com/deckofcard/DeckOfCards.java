package com.deckofcard;

import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
        List<String> ranks=Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
        List<String> deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, 4, 9);
        printPlayersCards(playersCards);
    }
    private static List<String> initializeDeck(List<String> suits, List<String> ranks) {
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }
    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck, new Random());
    }

    private static String[][] distributeCards(List<String> deck, int numPlayers, int cardsPerPlayer) {
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int player = 0; player < numPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playersCards[player][card] = deck.get(cardIndex++);
            }
        }

        return playersCards;
    }

    private static void printPlayersCards(String[][] playersCards) {
        for (int player = 0; player < playersCards.length; player++) {
            System.out.println("Player " + (player + 1) + " cards:");
            for (int card = 0; card < playersCards[player].length; card++) {
                System.out.println(playersCards[player][card]);
            }
            System.out.println();
        }
    }
}
