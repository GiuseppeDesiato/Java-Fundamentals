package labs_examples.enumerations.labs;


/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

class Exercise_01{

    public static void main(String[] args) {
        Season season = new Season();

        System.out.println(season.isNice(EnumSeasons.FALL));

    }
}

enum EnumSeasons {
    SPRING, SUMMER, FALL, WINTER
}

class Season {

    private EnumSeasons enumSeasons;

    public boolean isNice(EnumSeasons e) {
        if(enumSeasons == EnumSeasons.SPRING || enumSeasons == EnumSeasons.SUMMER){
            return true;
        }
        return false;
    }
}