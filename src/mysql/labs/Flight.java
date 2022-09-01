package mysql.labs;

public class Flight {

    String company_name = null;

    public String createFlight(String company_name){
        String sql = "INSERT INTO AirTravel.planes (company_name) VALUES " + company_name ;
        return sql;
    }

}
