package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card { //this will hold card data

    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(int suit, int cardValue) {
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
