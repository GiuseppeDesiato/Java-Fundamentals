package labs_examples.linked_list;

public class CustomLinkedList <T>{

    private Node head;

    public CustomLinkedList(T... data){
        if (data.length < 1){
            head = null;
        } else {
            for (T item : data){
                addFront(item);
            }
        }
    }

    //add an element at the front of a list
    public void addFront (T data){
        if (head == null){
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    //add an element at the end of a list
    public void addEnd (T data){
        if (head == null){
            head = new Node(data);
        } else {
            Node iterator =  head;
            // starting from the initial node
            //loop to check that there are not any new node
            //pointing at the last node
            while (iterator.next != null){
                iterator = iterator.next;
            }

            //adding the new node
            iterator.next = new Node(data);
        }
    }

    //method that returns the data
    //take the first element of the list and remove it
    public T popFront(){
        if (head == null){
            return null;
        }
        //grabbing the first node
        Node returnValue = head;
        //point head to the next node in the list
        head = head.next;
        //return the node back to the user
        return (T) returnValue.data;
    }

    //how do we remove from the middle of a list?
    //head.next = head.next.next
    public void remove(T data){
        //list is empty nothing to delete
        if (head == null){
            return;
        }
        // the item they want to delete is the first element in the linked list
        if (head.data == data){
            popFront();
        } else {
            // not the first element, start iterating - don't modify "head" ever
            Node iterator = head;

            // because we may need to delete from the middle or the end of the list\
            // we want to track the previous node
            Node previous = null;

            // start iterating until you find data or reach the end or the end of the list
            while (iterator.data != data && iterator.next != null){
                previous = iterator;
                iterator = iterator.next;
            }

            // when we exit while loop we have found data or the end of the list

            if (iterator.next == null && iterator.data != data){
                System.out.println("The data you are trying to delete does not exist");
                return;
                // if we found the end of the list and the data match. delete last element
            } else if (iterator.next == null && iterator.data == data){
                previous.next = null;
            // otherwise we found data at the end of the list and we need to prune it, delete it
            } else {
                previous.next = iterator.next;
            }
        }
    }

    public void print(){
        if (head == null){
            System.out.println("the list is empty");
            return;
        }

        Node iterator = head;
        System.out.println(iterator.data);

        while(iterator.next != null){
            iterator = iterator.next;
            System.out.println(iterator.data);
        }

    }

    //how many nodes does the linked list contains?
    public int size(){
        int count = 0;

        if (head == null){
            return count;
        }

        Node iterator = head;
        count++;

        while(iterator.next != null){
            iterator = iterator.next;
            count++;
        }

        return count;
    }

    // to check if the linked list contain a specific piece of data
    public boolean contain(T data){
        if (head == null){
            return false;
        }

        Node iterator = head;

        if (iterator.data == data){
            return true;
        }

        while (iterator.next != null){
            iterator = iterator.next;

            if (iterator.data == data){
                return true;
            }
        }
        return false;
    }

}
