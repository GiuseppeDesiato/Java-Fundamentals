package mysql.labs;

public class Passenger {

    String first_name = null;
    String last_name = null;
    String email = null;
    int id = 0;


    public String createPassenger(String first_name, String last_name, String email){
        String sql = "INSERT INTO AirTravel.passengers (first_name, last_name, email) VALUES ( '" + first_name + "'" + "," + "'" + last_name + "'" + "," + "'" + email + "')";
        return sql;
    }

    public String deletePassenger(int id){
        String sql = "DELETE FROM AirTravel.passengers WHERE (`id` = " + "'" + id + "'" + ")";
        return sql;
    }

    public String updatePassenger(String first_name, String last_name, String email, int  id){
        String sql = "UPDATE AirTravel.passengers SET `first_name` = '" + first_name  + "',`last_name` = '" + last_name + "',`email` = '" + email  + "' WHERE (`id` = '" + id +  "');";
        return sql;
    }

    public String queryPassenger(int  id){
        String sql = "Select AirTravel.passengers WHERE (`id` = " + "'" + id + "'" + ")";
        return sql;
    }

}
