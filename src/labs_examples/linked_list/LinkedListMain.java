package labs_examples.linked_list;

public class LinkedListMain {

    public static void main(String[] args) {
        CustomLinkedList<String> myLinkedList = new CustomLinkedList<>();

        myLinkedList.addFront("hello");
        myLinkedList.addFront("world");
        myLinkedList.addFront("yay");


        myLinkedList.remove("world");

        myLinkedList.print();

        boolean b1 = myLinkedList.contain("world");
        System.out.println(b1);

        System.out.println(myLinkedList.size());

//
//        CustomLinkedList<Integer> myStack = new CustomLinkedList<>();
//
//        myStack.addFront(10);
//        myStack.addFront(20);
//        myStack.addFront(30);
//
//        int a = myStack.popFront();
//        int b = myStack.popFront();
//        int c = myStack.popFront();
//
//        System.out.println(a + "" + b + "" + c);
    }
}
