package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        System.out.println("Player name: ");
        playBlackJack();
    }

    public static void playBlackJack() {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Player realPlayer = new Player(input);
        Player cpPlayer = new Player("Virtual_Player");

        System.out.println("Hi " + input + "! Welcome to the BlackJack game.");
        System.out.println("You are going to play against " + cpPlayer.name);
        System.out.println(" ");

        int totalMoney = 0;

        //creating the deck
        Deck playingDeck = new Deck();
        playingDeck.populateDeck();
        //playingDeck.printDeck();

        realPlayer.hand = new Hand(playingDeck);
        cpPlayer.hand = new Hand(playingDeck);

        playingDeck.deal(realPlayer);
        //you need to give two cards to the player
        playingDeck.deal(cpPlayer);

        /*
        System.out.print("Place a bet? y/n: ");
        String answer = scanner.next().toLowerCase();
        if (answer.equals("y")) {
            totalMoney += realPlayer.placeBet(realPlayer);
        }
        */


        System.out.println(input + ", your current hand value is: ");
        realPlayer.hand.printHand();
        System.out.println("Your total score is: " + realPlayer.hand.handScore());
        System.out.println(" ");


        //real player's turn
        while (true) {
            System.out.println("Do you want another card? (y/n)");
            String yesOrNo = scanner.nextLine().toLowerCase();
            System.out.println(" ");


            if (!(yesOrNo.equals("y") || yesOrNo.equals("n"))) {
                System.out.println("Wrong answer. Please type 'y' or 'n'.");

            } else if (yesOrNo.equals("y")) {
                playingDeck.deal(realPlayer);
                System.out.println("Your current hand:");
                realPlayer.hand.printHand();
                System.out.println("your total is: " + realPlayer.hand.handScore());

                if (realPlayer.hand.handScore() > 21) {
                    System.out.println("Hey " + input + " you went above 21. You lost!");
                    System.out.println();
                    System.out.println("Ok. Now is " + cpPlayer.name + "'s turn");
                    break;
                }
            } else if (yesOrNo.equals("n")) {
                System.out.println("Ok. Now is " + cpPlayer.name + "'s turn");
                break;
            }
        }
        System.out.println("..." + cpPlayer.name + "...");
        System.out.println(" ");


        // computer's turn
        while (cpPlayer.computerAi()) {
            playingDeck.deal(cpPlayer);
            System.out.println(cpPlayer.name + "'s hand is: ");
            cpPlayer.hand.printHand();
            System.out.println(cpPlayer.name + "'s total is: " + cpPlayer.hand.handScore());
            System.out.println(" ");

            if (cpPlayer.hand.handScore() > 21) {
                System.out.println(cpPlayer.name + " lost!");
                System.out.println();
                break;

            } else if (cpPlayer.hand.handScore() == 21 || (cpPlayer.hand.handScore() > realPlayer.hand.handScore()
                    && cpPlayer.hand.handScore() < 22)) {
                System.out.println("--------------------");
                System.out.println(cpPlayer.name + " won!");
                System.out.println("--------------------");
                System.out.println();
                break;

            }
        }

        if (realPlayer.hand.handScore() < 22 && cpPlayer.hand.handScore() > 21) {
            System.out.println("--------");
            System.out.println("YOU WON!");
            System.out.println("--------");
        } else if (realPlayer.hand.handScore() > 21 && cpPlayer.hand.handScore() > 21) {
            System.out.println("-------------");
            System.out.println("YOU BOTH LOST.");
            System.out.println("-------------");
        } else if ((cpPlayer.hand.handScore() == realPlayer.hand.handScore()) && cpPlayer.hand.handScore() < 22) {
            System.out.println("-------------");
            System.out.println("PUSH.");
            System.out.println("-------------");
        }
    }
}