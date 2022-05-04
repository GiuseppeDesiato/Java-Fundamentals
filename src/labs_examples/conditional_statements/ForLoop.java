package labs_examples.conditional_statements;

public class ForLoop {

    public static void main(String[] args) {

        //for(initialization, (boolean) condition, iterator)
        for(int i = 0; i < 10; i += 2){
            System.out.println("i = " + i);
            for(int x = 0; x < 10; x += 3){
                System.out.println("--- x = " + x);
            }
        }
    }
}
