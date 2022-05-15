package labs_examples.methods;

public class ReverseArray {

    public static void main(String[] args) {


        int[] origin = { 45, 3, 57, 23, 12, 9, 4};

        reversArray(origin);


        for(int j : origin){
            System.out.print(j + " ");
        }


    }

    public static int[] reversArray(int[] origin){

        int temp = 0;

        for( int i = 0; i < (origin.length -1) / 2; i++){

            temp = origin[i];
            origin [i] = origin[origin.length - 1 -i];
            origin[origin.length - 1 -i] = temp;

        }
        return origin;
    }
}
