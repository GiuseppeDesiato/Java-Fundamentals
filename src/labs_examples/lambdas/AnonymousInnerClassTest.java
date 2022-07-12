package labs_examples.lambdas;

public class AnonymousInnerClassTest {

        public static void main(String[] args) {

            // Step 1) Please demonstrate the creation of an anonymous inner class from the interface AnonymousInner below
            // Step 2) Demonstrate calling both methods using the object you created (by creating an anonymous inner class)
            AnonymousInner anon = new AnonymousInner() {
                @Override
                public void methodOne() {
                    System.out.println("Print test");
                }

                @Override
                public int methodTwo(int a) {
                    return a / a;
                }
            };

            anon.methodOne();
            int a = anon.methodTwo(8);
            System.out.println(a);


        }
    }

    interface AnonymousInner {
        public void methodOne();
        public int methodTwo(int a);
    }

