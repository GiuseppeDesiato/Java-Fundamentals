package labs_examples.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {

    public static void main(String[] args) {
        // the main method is where every application begins by default
        printCurrentTime();
    }

    public static void printCurrentTime(){
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("The current time is: " + time);
    }
}
