package labs_examples.conditional_statements;

public class SwitchStatement {

    public static void main(String[] args) {

        //Use when you have a known set of values
        String str = "gold";

        System.out.println("----------------------------------------------------");
        System.out.println("Your membership gives access to the following level:");
        System.out.println("----------------------------------------------------");

        switch(str){  //we are going to run the switch statement on the variable i
            case "gold" :
                System.out.println("gold level");
                break;
            case "silver" :
                System.out.println("silver level");
                break;
            case "bronze" :
                System.out.println("bronze level");
                break;
            case "platinum" :
                System.out.println("all levels");
                break;
            default : //default is like the final else. if none of the previous options are correct, then...
                System.out.println("Please, insert again your membership type");
        }
    }



}
