package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import sun.lwawt.PlatformEventNotifier;

import java.util.Scanner;

public class Player { //this will hold player info

    String name;
    Deck deck;
    Hand hand;
    int potValue;
    String message;
    int currentBet;

    Scanner scanner = new Scanner(System.in);

    public Player(String name, Deck deck, Hand hand, int potValue, String message, int currentBet) {
        this.name = name;
        this.deck = deck;
        this.hand = hand;
        this.potValue = potValue;
        this.message = message;
        this.currentBet = currentBet;
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

    public String whoWon(Player realPlayer, Player cpPlayer){

        message = " ";

        if (realPlayer.hand.handScore() < 22 && (cpPlayer.hand.handScore() > 21 || cpPlayer.hand.handScore() < realPlayer.hand.handScore())) {
            return message = "YOU WON!";

        } else if (realPlayer.hand.handScore() > 21 && cpPlayer.hand.handScore() > 21) {
            return message = "YOU BOTH LOST.";

        } else if ((cpPlayer.hand.handScore() == realPlayer.hand.handScore()) && cpPlayer.hand.handScore() < 22) {
            return message = "PUSH";

        } else if (cpPlayer.hand.handScore() > 21) {
            return message = cpPlayer.name + " lost!";

        } else if (cpPlayer.hand.handScore() > realPlayer.hand.handScore() && cpPlayer.hand.handScore() < 22) {
            return message = cpPlayer.name + " won!";

        } else if (cpPlayer.hand.handScore() < realPlayer.hand.handScore() && realPlayer.hand.handScore() > 21) {
            return message = cpPlayer.name + " won!";
        }

        return null;
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