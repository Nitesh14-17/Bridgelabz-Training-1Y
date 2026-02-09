/*Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute
the deck of n cards to x number of players. Finally, print the cards the players have.
Hint =>
a. Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks
from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
b. Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
c. Write a Method to Initialize the deck of cards with suits and ranks and return the deck.
The deck is an array of strings where each string represents a card in the deck
represented as "rank of suit" e.g., "2 of Hearts"
d. Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the
card iterate over the deck and swap each card with a random card from the remaining
deck to shuffle the deck. Please find the steps below
Step1: Use for Loop Iterate over the deck and swap each card with a random card from
the remaining deck
Step 2: Inside the Loop Generate a random card number between i and n using the
following code
int randomCardNumber = i + (int) (Math.random() * (n - i));
Step 3: Swap the current card with the random card
e. Write a Method to distribute the deck of n cards to x number of players and return the
players. For this Check the n cards can be distributed to x players. If possible then
Create a 2D array to store the players and their cards
f. Write a Method to Print the players and their cards */
package String.Level3;
import java.util.Scanner;
public class Que_10 {static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int numOfCards = suits.length * ranks.length;

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        String[] shuffledDeck = shuffleDeck(deck);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number of players: ");
            int numOfPlayers = scanner.nextInt();
            System.out.print("Enter number of cards per player: ");
            int cardsPerPlayer = scanner.nextInt();

            String[][] players = distributeCards(shuffledDeck, numOfPlayers, cardsPerPlayer);
            printPlayersCards(players);
        } finally {
            scanner.close();
        }
    }

    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        if (numOfPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numOfPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

}
