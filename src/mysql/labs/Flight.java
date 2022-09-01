package mysql.labs;

public class Flight {

    String company_name = null;
    int id = 0;

    public String createFlight(String company_name){
        String sql = "INSERT INTO AirTravel.planes (company_name) VALUES ( '" + company_name + "')";
        return sql;
    }

    public String deleteFlight(int id){
        String sql = "DELETE FROM AirTravel.planes WHERE (`id` = " + "'" + id + "'" + ")";
        return sql;
    }

    public String updateFlight(String company_name, int id){
        String sql = "UPDATE AirTravel.passengers SET `company_name` = '" + company_name  + " WHERE (`id` = " + "'" + id + "'" + ")";
        return sql;
    }

}
