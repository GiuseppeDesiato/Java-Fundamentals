package labs_examples.conditional_statements;

public class DoWhileLoopExer {

    public int doWhileExample() {

        int count = 0;

        int val = 0;

        // write a do-while loop below that will loop until "count" is no longer less than 10
        do{
            val += count;
            count++;

        } while(count < 10);

        // within the do-while loop, add the value of "count" to the current value of "val"
        // then within the do-while loop, increment your counter

        return val;

    }
}
