package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        if (a & b){
            System.out.println("both a & b are true");
        }
        if (a && b){
            System.out.println("both a & b are true");
        }
        if (a | b) {
            System.out.println("a or b are true");
        }
        if (a || b){
            System.out.println("a or b are true");
        }
        if (a ^ b){
            System.out.println("exclusive a or b are true");
        }
        if (a  & !b){
            System.out.println("a and not b is true");
        }

    }

}

