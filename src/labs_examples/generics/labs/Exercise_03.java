package labs_examples.generics.labs;


/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {
    public static void main(String[] args) {


        Operations op = new Operations();

        double sum = op.sumDouble(89.32, 78.19);
        System.out.println(sum);

        String[] strArray = {"dog", "anna", "otto", "cat", "gigi"};
        int count = op.countElem(strArray);
        System.out.println(count);

    }
}

class Operations{

    public static <T extends Number, V extends Number> double sumDouble(T a, V b){
        return a.doubleValue() + b.doubleValue();
    }

    public int countElem(String[] strList){
        String str = "";

        int countPal = 0;

        for(int i = 0; i < strList.length; i++) {
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) != (str.charAt(str.length() - 1 - j))) {
                    countPal = countPal;
                } else {
                    countPal++;
                }
            }
        }
        return countPal;
    }
}
