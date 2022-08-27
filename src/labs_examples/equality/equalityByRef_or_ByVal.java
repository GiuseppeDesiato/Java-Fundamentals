package labs_examples.equality;

public class equalityByRef_or_ByVal {

    public static void main(String[] args) {

        // equality by value
        int a1 = 3;
        int b1 = a1;
        int c1 = 3;
        System.out.println("Example 1 (with primitive data types):");
        System.out.printf("%b, %b", a1==b1, a1==c1);

        // equality by reference
        Custumer a2 = new Custumer();
        Custumer b2 = a2;
        Custumer c2 = new Custumer();
        System.out.println("\n\nExample 2 (with objects):");
        System.out.printf("%b, %b", a2==b2, a2==c2);
    }

    public static class Custumer{

        private String firstName;
        private String lastName;
        private String email;
        private String telNumber;

        public Custumer() {
        }

        public Custumer(String firstName, String lastName, String email, String telNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.telNumber = telNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelNumber() {
            return telNumber;
        }

        public void setTelNumber(String telNumber) {
            this.telNumber = telNumber;
        }
    }
}
