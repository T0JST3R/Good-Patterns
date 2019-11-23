package javagoodpatterns.builder;

public class Main {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder()
                .from("Los Angeles")
                .to("San Francisco")
                .price(1)
                .build();
        System.out.println(leg);
    }
}
