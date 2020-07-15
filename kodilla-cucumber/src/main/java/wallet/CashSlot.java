package wallet;

public class CashSlot {

        // zostaje
        private int contents;

        public int getContents() {
            return contents;
        }

        public void dispense(int amount) {
            this.contents = amount;
        }
    }