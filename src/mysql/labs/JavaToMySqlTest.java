package mysql.labs;

import java.sql.*;

public class JavaToMySqlTest {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        Flight flight = new Flight();
        Passenger passenger = new Passenger();

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost:3306/AirTravel?"
                    + "user=<USER>&password=<PASSWORD>"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            // Setup the connection with the DB
            connection = DriverManager.getConnection(connectionString);

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            String sql = passenger.createPassenger("mar", "mor", "marmor@mail.com");
            statement.executeUpdate(sql);

            /*
            String sql = "INSERT INTO AirTravel.passengers (first_name, last_name, email) VALUES ('mic', 'col', 'miccol@mail.com')";
            statement.executeUpdate(sql);

            String sql1 = "INSERT INTO AirTravel.passengers (first_name, last_name, email) VALUES ('san', 'pul', 'sanpul@mail.com')";
            statement.executeUpdate(sql1);
            */

           // String sql2 = flight.createFlight("lufthansa");
            // statement.executeUpdate(sql2);

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from AirTravel.passengers");

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, names fields from the result set and assign them to local variables
                int id = resultSet.getInt("id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");

                // print out the result
                System.out.println("Passenger " + id + " is " + first_name + " " + last_name);
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

