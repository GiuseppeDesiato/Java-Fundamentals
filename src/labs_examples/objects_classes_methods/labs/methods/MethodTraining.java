package labs_examples.objects_classes_methods.labs.methods;


public class MethodTraining {

    public static void main(String[] args) {

        //1)
        int a = 5;
        int b = 7;

        double c = 6.7;
        double d = 3.2;
        double e = 10.8;

        int x = add(a, b);
        System.out.println(x);

        double y = add(c, d, e);
        System.out.println(y);


        //2)
        int weightKg = 80;
        System.out.println("the old weight was: " + weightKg);
        newWeight(weightKg);

        Customer customer1 = new Customer(34, 80, "Eric");
        System.out.println(customer1.toString());
        addWeightToPerson(customer1);
        System.out.println(customer1.toString());


        //4)
        int consonants  = countConsonants("Boston");
        System.out.println("the number of consonants is :" + consonants);


        //5)
        int num = 11;
        System.out.println("Is the num " + num + " a prime number? " + isPrime(3));


        //6)
        int[] array = {12, 4, 578, 39, 30};
        int[] array2 = minMax(array);
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }

    // 1) Demonstrate method overloading in this class

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double c, double d, double e){
        return c + d + e;
    }



    // 2) Demonstrate the difference between "pass by value" and "pass by reference"

    //pass by value
    public static void newWeight(int weightKg){
        System.out.println("the new weight is: " + (weightKg - 5));
    }

    // pass by reference
    public static void addWeightToPerson(Customer customer1){
        customer1.weight = customer1.weight + 10;
    }




    //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int maxNum (int f, int g, int h, int i){

        int max = f;

        if (g > max)
            max = g;
        if (h > max)
            max = h;
        if (i > max)
            max = i;

        return max;
    }



    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }

        } return count;
    }



    // 5) Write a method that will determine whether or not a number is prime
    public static boolean isPrime(int prime){
        if (prime <= 1)
            return false;

        for (int i = 2; i < prime; i++)
            if (prime % i == 0)
                return false;

        return true;
    }



    // 6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //            which is passed in as an argument
    public static int[] minMax(int[] array){

        int[] newArray = new int[2];

        int max = array[0];
        int min = array[0];

        for(int i = 1; i < array.length -1; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        newArray[0] = max;

        for(int i = 1; i < array.length -1; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        newArray[1] = min;

        return newArray;
    }

    //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //        length of the returned list

}
