package labs_examples.conditional_statements;

public class DoWhile {

    public static void main(String[] args) {

        int count =  0;

        /* the do while loop is useful if dor example we need to get the user input
        before evaluating it. So you get it and then you check it.
        */
        do {
            System.out.println("count is " + count);
            count++;
        } while(count < 10);

        System.out.println("all done!");

    }
}
