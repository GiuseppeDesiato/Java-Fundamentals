package labs_examples.methods;

public class VarArgsExer {

        public static void main(String[] args) {
            // please create the varargs method as instructed below
            // then, please call the varargs method at least 3 // times here with a different number of arguments
            String[] a = {"Hi!", "how", "are", "you"};
            String[] b = {"Hello", "World", "!"};
            String[] c = {"Wow"};

            printLength(a);
            printLength(b);
            printLength(c);
        }

        // please write a varargs method of your choice that
        // prints out the length of the array of arguments
        // passed into the method below
        public static void printLength(String... args){
            int length = args.length;
            System.out.println(length);

        }



    }

