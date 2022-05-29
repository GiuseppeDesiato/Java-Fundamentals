package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card { //this will hold card data

    char[] suit;
    int cardValue;

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(int cardValue) {
        this.cardValue = cardValue;
    }

    public String value() {

        Integer i = new Integer(cardValue);

        if (cardValue >= 2 &&  cardValue <= 10){
            return i.toString();
        } else if (cardValue == 11){
            return "Jack";
        }else if (cardValue == 12){
            return "Queen";
        }else if (cardValue == 13){
            return "King";
        } else if(cardValue == 1) {
            return "Ace";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + Arrays.toString(suit) +
                ", cardValue=" + cardValue +
                '}';
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

}
