package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class HikerMysql {

    String first_name = null;
    String last_name = null;
    String email = null;

    Scanner scanner = new Scanner(System.in);
    String input = "";

    public String createHiker(String first_name, String last_name, String email){
        String sql = "INSERT INTO SummitApp.hikers (first_name, last_name, email) VALUES ( '" + first_name + "'" + "," + "'" + last_name + "'" + "," + "'" + email + "')";
        return sql;
    }

    public String deleteHiker(String email){
        String sql = "DELETE FROM SummitApp.hikers WHERE (`email` = " + "'" + email + "'" + ")";
        return sql;
    }

    public String updateHiker(String first_name, String last_name, String email){
        String sql = "UPDATE SummitApp.hikers SET `first_name` = '" + first_name  + "',`last_name` = '" + last_name + "',`email` = '" + email  + "' WHERE (`email` = '" + email +  "');";
        return sql;
    }


    public void hikerProfile() {

        boolean isDone = true;
        while (isDone) {

            System.out.println("1. Create a new user profile.");
            System.out.println("2. Returning user");
            input = scanner.next();


            switch (input) {
                case "1":
                    System.out.println("New User");

                    System.out.println("First Name: ");
                    String first_name = scanner.next();

                    System.out.println("Last Name: ");
                    String last_name = scanner.next();

                    System.out.println("email: ");
                    String email = scanner.next();

                    createHiker(first_name, last_name, email);


                    System.out.println("Hi " + first_name + "!" + " how would you define your level of expertise?");
                    System.out.println("1. (beginner) / 2. (intermediate) / 3 (expert)");
                    String level = scanner.next();

                    System.out.println("Would you like to receive trails' suggestions?");
                    System.out.println("y / n");
                    String yesNoAns = scanner.next();

                    System.out.println("Great, thank you " +  first_name + "!");
                    System.out.println(" ");

                    isDone = false;
                    break;

                case "2":
                    System.out.println("Returning User");

                    System.out.println("Name: ");
                    first_name = scanner.next();

                    System.out.println("Hi " +  first_name + "!" + " Welcome back!");
                    System.out.println(" ");

                    isDone = false;
                    break;

                default:
                    System.out.println("Please choose between option 1 or 2.");
            }
        }
    }


}
