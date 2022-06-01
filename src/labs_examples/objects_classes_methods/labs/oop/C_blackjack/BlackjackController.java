package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        BlackjackController mainController = new BlackjackController();

        System.out.println("Player name: ");
        playBlackJack();

    }

    public static void playBlackJack() {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Player realPlayer = new Player(input);
        Player cpPlayer = new Player("Virtual_Player");

        int currentBet = 0;
        int totalMoney = 100;

        System.out.println("Hi " + input + "! Welcome to the BlackJack game.");
        System.out.println("You are going to play against " + cpPlayer.name);
        System.out.println("Your budget is: " + totalMoney + "$");
        System.out.println(" ");

        //creating the deck
        Deck playingDeck = new Deck();
        playingDeck.populateDeck();
        //playingDeck.printDeck();

        realPlayer.hand = new Hand(playingDeck);
        cpPlayer.hand = new Hand(playingDeck);

        playingDeck.deal(realPlayer); // give two cards to the user
        playingDeck.deal(realPlayer);

        playingDeck.deal(cpPlayer); //  give only one card, because the second card is given inside cpPLayer while loop

        // big loop, for playing the game consecutively till the user has money.
        while(!realPlayer.noMoney(totalMoney)){

            while (true) {
                System.out.print("Place a bet? (y/n): ");
                String answer1 = scanner.next().toLowerCase();

                if (!(answer1.equals("y") || answer1.equals("n"))) {
                    System.out.println("Wrong answer. Please type 'y' or 'n'.");
                } else if (answer1.equals("y")) {
                    System.out.println("How much money do you want to bet?");
                    currentBet = scanner.nextInt();
                    scanner.nextLine();
                    realPlayer.placeBet(currentBet);
                    break;
                }
            }

            System.out.println(input + ", your current hand value is: ");
            realPlayer.hand.printHand();
            System.out.println("Your total score is: " + realPlayer.hand.handScore());
            System.out.println(" ");


            //real player's turn
            while (true) {
                System.out.println("Do you want another card? (y/n)");
                String answer2 = scanner.nextLine().toLowerCase();
                System.out.println(" ");

                if (!(answer2.equals("y") || answer2.equals("n"))) {
                    System.out.println("Wrong answer. Please type 'y' or 'n'.");

                } else if (answer2.equals("y")) {
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

                } else if (answer2.equals("n")) {
                    System.out.println("Ok. Now is " + cpPlayer.name + "'s turn");
                    break;
                }
            }
            System.out.println("..." + cpPlayer.name + "...");
            System.out.println(" ");


            // computer's turn
            while (true) {
                playingDeck.deal(cpPlayer);
                System.out.println(cpPlayer.name + "'s hand is: ");
                cpPlayer.hand.printHand();
                System.out.println(cpPlayer.name + "'s total is: " + cpPlayer.hand.handScore());
                System.out.println(" ");

                if (cpPlayer.hand.handScore() > 15){
                    break;
                }

            }

            String message = " ";

            //write a helper method
            if (realPlayer.hand.handScore() < 22 && (cpPlayer.hand.handScore() > 21 || cpPlayer.hand.handScore() < realPlayer.hand.handScore())) {
                message = "YOU WON!";
                totalMoney += currentBet;

            } else if (realPlayer.hand.handScore() > 21 && cpPlayer.hand.handScore() > 21) {
                message = "YOU BOTH LOST.";
                totalMoney -= currentBet;

            } else if ((cpPlayer.hand.handScore() == realPlayer.hand.handScore()) && cpPlayer.hand.handScore() < 22) {
                message = "PUSH";
                totalMoney += (currentBet / 2);

            } else if (cpPlayer.hand.handScore() > 21) {
                message = cpPlayer.name + " lost!";

            } else if (cpPlayer.hand.handScore() > realPlayer.hand.handScore() && cpPlayer.hand.handScore() < 22) {
                message = cpPlayer.name + " won!";
                totalMoney -= currentBet;

            } else if (cpPlayer.hand.handScore() < realPlayer.hand.handScore() && realPlayer.hand.handScore() > 21) {
                message = cpPlayer.name + " won!";
                totalMoney -= currentBet;
            }

        System.out.println("-------------");
        System.out.println(message);
        System.out.println("-------------");
        System.out.println("You have " + totalMoney + "$");
        System.out.println(" ");


        //clear hands and give new cards
        realPlayer.hand.cardsInHand.clear();
        playingDeck.deal(realPlayer);
        playingDeck.deal(realPlayer);
        cpPlayer.hand.cardsInHand.clear();
        playingDeck.deal(cpPlayer);


        if (realPlayer.noMoney(totalMoney)){
            System.out.println("You do not have any more money! Ciao.");
        }

        }

    }
}
