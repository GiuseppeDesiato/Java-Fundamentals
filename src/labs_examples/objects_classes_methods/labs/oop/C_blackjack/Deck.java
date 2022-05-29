package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck { //this will hold deck data

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<Integer>();
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};


    //constructor
    public Deck() {
        populateDeck();
    }


    //method - populate the Card[] with 52 unique Card object.
    public void populateDeck(){
        int i = 0;
        for(int s = 0; s < suit.length ; s++){
            for(int cardValue = 1; cardValue < 14; cardValue++) {
                cards[i] = new Card(new char[]{suit[s]}, cardValue);
                i++;
            }
        }
    }

    public void printDeck(){
        for(int i = 0; i < cards.length; i++){
            System.out.println(cards[i]);
        }
    }


    //method - deal the player a random card.
    public int deal(Player player){
        Random random = new Random();
        Hand hand = new Hand();
        int randValue = random.nextInt(52);
        while (usedCards.contains(randValue)){
            randValue = random.nextInt(52);
        }
        usedCards.add(randValue); //add that random number to the ArrayList<Integer> called usedCards
        player.hand.cardsInHand.add(cards[randValue]); // add the card at the index of random num from the Cards[] to the player's "Hand" ArrayList

        Card currentCard = cards[randValue];
        return currentCard.cardValue;
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }

    // GETTERS and SETTERS
    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }
}
