package Class;

public class WeddingCake extends Cake {

        private int numberOfTiers;


        public WeddingCake(String flavor, double price, int tiers) {
            super(flavor, price);
            this.numberOfTiers = tiers;
        }

        public int getTiers() {
            return numberOfTiers;
        }

        public void setTiers(int tiers) {
            this.numberOfTiers = tiers;
        }
    }

