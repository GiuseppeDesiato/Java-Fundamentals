package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


import java.sql.SQLException;
import java.util.Scanner;

import static labs_examples.objects_classes_methods.labs.oop.D_my_oop.SummitController.db;

public class TrailMysql {

    Scanner scanner = new Scanner(System.in);

    int trail_id;
    String trail_name = null;
    double trail_miles = 0;
    double trail_elevation = 0;
    String trail_difficulty = null;
    int is_loop = 1;
    int is_open = 1;


    public String createTrail(String trail_name, double trail_miles, double trail_elevation,
                              String trail_difficulty, int is_loop, int is_open){
        String sql = "INSERT INTO SummitApp.trails (trail_name, trail_miles, trail_elevation," +
                "trail_difficulty, trail_loop, is_open) VALUES ( '" + trail_name + "'" + "," + "'" + trail_miles +
                "'" + "," + "'" + trail_elevation + "'" + "," + "'" + trail_difficulty + "'" + "," + "'" +
                is_loop + "'" + "," + "'" + is_open +"')";
        return sql;
    }

    public String updateTrail(int is_open, int trail_id){
        String sql = "UPDATE SummitApp.trails SET `is_open` = '" + is_open + "' WHERE (`trail_id` = '" + trail_id + "');";
        return sql;
    }


    public void selectTrail(int trail_id_Num) throws SQLException {
        db.resultSet = db.statement.executeQuery("Select * From SummitApp.trails WHERE (`trail_id` = " + trail_id_Num + ")");
        while (db.resultSet.next()) {

            // get the id, names fields from the result set and assign them to local variables
            int trail_id = db.resultSet.getInt("trail_id");
            String trail_name = db.resultSet.getString("trail_name");
            double trail_miles = db.resultSet.getDouble("trail_miles");
            double trail_elevation = db.resultSet.getDouble("trail_elevation");
            String trail_difficulty = db.resultSet.getString("trail_difficulty");
            boolean is_loop = db.resultSet.getBoolean("trail_loop");
            boolean is_open = db.resultSet.getBoolean("is_open");

            // print out the result
            System.out.println("Trail id " + trail_id + "\n"
                    + "Name: " + trail_name + "\n"
                    + "Miles: " + trail_miles + " miles" + "\n"
                    + "Elevation: " + trail_elevation + "\n"
                    + "Difficulty: " + trail_difficulty + "\n"
                    + "Loop: " + is_loop + "\n"
                    + "Open: " + is_open
            );
            return;
        }
    }

    public String userCreateTrail(){

        System.out.println("===New Trail===");

        System.out.println("Name: ");
        String trail_name = scanner.next();

        System.out.println("Miles: ");
        Double trail_miles = scanner.nextDouble();

        System.out.println("Elevation: ");
        Double trail_elevation = scanner.nextDouble();

        System.out.println("Difficulty: (easy / moderate / hard)");
        String trail_difficulty = scanner.next();

        System.out.println("is a loop: (1 = true, 0 = false)");
        int trail_loop = scanner.nextInt();

        System.out.println("is open: (1 = true, 0 = false)");
        int is_open = scanner.nextInt();

        return createTrail(trail_name, trail_miles, trail_elevation, trail_difficulty, trail_loop, is_open);
    }

}
