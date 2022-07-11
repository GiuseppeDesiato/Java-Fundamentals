package labs_examples.enumerations;

public class EnumTest {

    enum PizzaStatus {
        //ADD THE STATUSES
        ORDERED, MAKING, READY, DELIVERED
    }


    class Pizza{
        private PizzaStatus status;

        public boolean isDeliverable() {
            // COMPLETE SO THAT THIS RETURNS TRUE WHEN STATUS IS READY
            if(status == PizzaStatus.READY){
                return true;
            }

            return false;
        }

        public PizzaStatus getStatus() {
            return status;
        }

        public void setStatus(PizzaStatus status) {
            this.status = status;
        }
    }
}
