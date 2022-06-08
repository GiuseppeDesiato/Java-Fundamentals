package labs_examples.arrays;

public class ArrayList<T> {

    public static void main(String[] args) {

        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Programming");
        arrayList.add("is");
        arrayList.add("so");
        arrayList.add("Programming");
        arrayList.add("cool");

        boolean check = arrayList.contains("are ");
        System.out.println(check);

        for(String s : arrayList) {
            System.out.println(s);
        }

        int  lastIndexOfProgramming = arrayList.lastIndexOf("Programming");
        System.out.println(lastIndexOfProgramming);

    }
}