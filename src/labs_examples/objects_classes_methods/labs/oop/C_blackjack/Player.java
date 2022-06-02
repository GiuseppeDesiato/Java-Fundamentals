package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player { //this will hold player info

    String name;
    Deck deck;
    Hand hand;
    int potValue;

    Scanner scanner = new Scanner(System.in);

    public Player(String name, Deck deck, Hand hand, int potValue) {
        this.name = name;
        this.deck = deck;
        this.hand = hand;
        this.potValue = potValue;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    public boolean noMoney(int amountOfMoney){
        return amountOfMoney < 1;
    }

    public int placeBet(int bet) {

        boolean loop = true;

        if (potValue >= bet) {
            System.out.println("You placed a bet for " + bet + "$");
            return bet;

        } else if (bet > potValue){
            System.out.println("You do not have that amount of money");
            while (bet > potValue){
                System.out.println("Wrong mount. Please insert a valid amount.");
                bet = scanner.nextInt();
            }
            System.out.println("You placed a bet for " + bet + "$");
            return bet;

        } else if (potValue < 1) {
            System.out.println("You have no more money");
            System.exit(0);
            return 0;

        }
        return 0;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", deck=" + deck +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}