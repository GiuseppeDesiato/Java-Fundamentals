package labs_examples.conditional_statements;

public class FlowControlKeywords {

    public static void main(String[] args) {

        //FLOW CONTROL
        // continue, break, return

        //Continue. It forces an early iteration of the loop
        for(int i = 0; i < 10; i++){
            if(i == 3 || i == 7){
                continue;
            }
            System.out.println("i = " + i);
        }

//        //Break. it will break out ofthe nearest loop
//        for (int i = 0; i < 10; i++){
//
//            if(i == 3 || i == 7) {
//                //exits the nearest loop
//                break;
//            }
//            System.out.println("i = " + i);
//        }

        int i = someMethod(1);
        System.out.println("i = " + i);
    }
    // Return. It exits the current method and will return a value if the method requires it.
    public static int someMethod(int val){

        if(val == 0) {
            System.out.println("1) will this print?");
            return 0;
        } else if (val == 1){
            System.out.println("2) will this print?");
            return 1;
        } else {
            System.out.println("3) will this print?");
            return -1;
        }
    }
}
