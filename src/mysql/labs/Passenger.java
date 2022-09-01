package mysql.labs;

public class Passenger {

    String first_name = null;
    String last_name = null;
    String email = null;


    public String createPassenger(String first_name, String last_name, String email){
        String sql = "INSERT INTO AirTravel.passengers (first_name, last_name, email) VALUES ( '" + first_name + "'" + "," + "'" + last_name + "'" + "," + "'" + email + "')";
        return sql;
    }
}
