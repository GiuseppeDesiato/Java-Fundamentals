package labs_examples.conditional_statements;

public class NestedWhileLoops {

    public static void main(String[] args) {

        int innerCount = 0;
        int outerCount = 0;

         while(outerCount < 10){

            while(innerCount < 10){
                System.out.println("outer count is: " + outerCount
                                  + " " + "inner count is: " + innerCount);
                innerCount++;
            }
            innerCount = 0;
            outerCount++;
        }

        System.out.println("all done with white loop!");

    }
}
