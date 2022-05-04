package labs_examples.conditional_statements;

public class ForLoopExer {

    public static void main(String[] args) {
        // please use a for loop below to print out every number between 0 & 100
        for(int i = 0; i < 100; i++ ){
            System.out.println("i = " +  i);
            for(int x = 99; x > 0; x-=2){
                System.out.println("----x = " + x);
            }
        }
        // please use another for loop below to print out every odd number between 100 and 0 in descending order
        // pleasure demonstrate "nesting" two for loops below
    }
}
