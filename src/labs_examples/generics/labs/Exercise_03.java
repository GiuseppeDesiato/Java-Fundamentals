package labs_examples.generics.labs;


import java.util.ArrayList;

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

        //1)
        double sum = op.sumDouble(89.32, 78.19);
        System.out.println(sum);

        //2)
        String[] strArray = {"dog", "anna", "otto", "cat", "gigi"};
        int count = op.countElem(strArray);
        System.out.println(count);

        //3)
        op.switchPos(strArray, 1,4);
        op.printArray(strArray);

        //4)
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(78);
        arrList.add(56);
        arrList.add(734);
        arrList.add(128);
        arrList.add(18);

        int highNum = op.largeElem(arrList);
        System.out.println(highNum);

    }
}

class Operations{

    //1)
    public static <T extends Number, V extends Number> double sumDouble(T a, V b){
        return a.doubleValue() + b.doubleValue();
    }

    //2) modify in order to become a generic method
    public int countElem(String[] strList){

        int countPal = 0;

        boolean flag = true;

        for(int i = 0; i < strList.length; i++) {
            for(int j = 0; j < strList[i].length()/2; j++){
                if(strList[i].charAt(j) != (strList[i].charAt(strList[i].length() - 1 - j))) {
                    flag = false;
                } else {
                    flag = true;
                }
            }
            if (flag){
                countPal++;
            }
        }
        return countPal;
    }

    //3)
    public <T> void switchPos(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public <T> void printArray(T[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    //4)
    public <T extends Number> T largeElem(ArrayList<T> list){
        int i = 0;
        T max = list.get(0);

        for(i = 0; i < list.size(); i++) {
            if(max.intValue() < list.get(i).intValue()){
                max = list.get(i);
            }
        }
        return max;
    }

}
