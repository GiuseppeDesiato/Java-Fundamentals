package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class TrailMysql {

    int trail_id;
    String trail_name = null;
    double trail_miles = 0;
    double trail_elevation = 0;
    String trail_difficulty = null;
    boolean is_loop = true;
    boolean is_open = true;


    public String createTrail(String trail_name, double trail_miles, double trail_elevation,
                              String trail_difficulty, boolean is_loop){
        String sql = "INSERT INTO SummitApp.trails (trail_name, trail_miles, trail_elevation," +
                "trail_difficulty, is_loop) VALUES ( '" + trail_name + "'" + "," + "'" + trail_miles +
                "'" + "," + "'" + trail_elevation + "'" + "," + "'" + trail_difficulty + "'" + "," + "'" +
                is_loop + "')";
        return sql;
    }

    public String updateTrail(int is_open, int trail_id){
        String sql = "UPDATE SummitApp.trails SET `is_open` = '" + is_open + "' WHERE (`trail_id` = '" + trail_id + "');";
        return sql;
    }

}
