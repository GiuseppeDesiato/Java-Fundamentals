package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck { //this will hold deck data

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<Integer>();

    //constructor
    public Deck() {
        populate();
    }

    //method - populate the Card[] with 52 unique Card object
    private void populate(){

        // two nested for loops

    }

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
