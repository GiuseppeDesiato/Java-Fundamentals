package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Hand { //this will hold hand data

    ArrayList<Card> cardsInHand = new ArrayList<Card>();
    int handValue;

    public Hand(ArrayList<Card> cardsInHand, int handValue) {
        this.cardsInHand = cardsInHand;
        this.handValue = handValue;
    }

    public Hand() {
    }

    public Hand(Deck deck) {
    }

    //add ACE scoring
    public int handScore(){
        int handScore = 0;
        for(Card card : cardsInHand){
            if(card.cardValue >= 10){
                handScore += 10;
            } else {
                handScore += card.cardValue;
            }
        }
        return handScore;
    }

    public boolean isAbove21(){
        if (handScore() > 21) {
            return true;
        } else {
            return false;
        }
    }

    public void printHand() {
        for (Card card : cardsInHand) {
            System.out.println(card.value() + " of " + Arrays.toString(card.suit));
        }
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cardsInHand +
                ", handValue=" + handValue +
                '}';
    }

    public ArrayList<Card> getCards() {
        return cardsInHand;
    }

    public void setCards(ArrayList<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

}
