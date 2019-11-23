package javagoodpatterns.builder;


public class FlightLeg {

    private String from;
    private String to;
    private String delayed;
    private int price;

    private FlightLeg(String from, String to, String delayed, int price) {
        this.from = from;
        this.to = to;
        this.delayed = delayed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed='" + delayed + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private String delayed;
        private int price;

        public FlightLegBuilder from(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to) {
            this.to = to;
            return this;
        }

        public FlightLegBuilder price(int price) {
             this.price = price;
             return this;
        }

        public FlightLeg build() {
            if (price<=0){
                throw new IllegalStateException("price equal/less than 0");
            }
            return new FlightLeg(from , to , delayed , price);
        }


    }
}
