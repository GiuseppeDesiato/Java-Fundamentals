package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand { //this will hold hand data

    ArrayList<Card> cards;
    int handValue;

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public Hand() {
    }

    public int handScore(){
        int handScore = 0;
        for(Card card : cards){
            handScore += card.cardValue;
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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
}
