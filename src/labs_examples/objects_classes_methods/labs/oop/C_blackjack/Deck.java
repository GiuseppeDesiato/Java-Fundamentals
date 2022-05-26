package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck { //this will hold deck data

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<Integer>();


    //constructor
    public Deck() {
        populate();
    }

    //method - populate the Card[] with 52 unique Card object
    private void populate(){
        int i = 0;
        for(int suit = 0; suit < 4 ; suit++){
            for(int cardValue = 0; cardValue < 13; cardValue++) {
                cards[i] = new Card(suit, cardValue);
                i++;
            }
        }
    }

    //method - deal the player a random card
    public int deal(Player player){
        Random random = new Random();
        Hand hand = new Hand();
        int rand = random.nextInt(52);
        if (usedCards.contains(rand)){
            rand = random.nextInt(52);
        } else {
            usedCards.add(rand); //add that random number to the ArrayList<Integer> called usedCards
            player.hand.cards.add(cards[rand]); // add the card at the index of random num from the Cards[] to the player's "Hand" ArrayList
        }
        return rand;
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
