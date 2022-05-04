package labs_examples.conditional_statements;

public class FlowControlKeywordsExer {

        public static void main(String[] args) {
            // please demonstrate the use of the "continue" keyword below within a for loop
//            for(int i = 0; i < 10; i++){
//                if(i == 5){
//                    continue;
//                }
//                System.out.println(i);
//            }
            // please demonstrate the use of the "break" keyword below in a do-while loop
            int i = 0;
            do {
                System.out.println(i);
                i++;
                if(i == 7){
                    break;
                }
            } while(i < 10);
            System.out.println(i);
        }
    }

