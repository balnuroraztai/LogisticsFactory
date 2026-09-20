package factorymethod;

public class Main {

    public static void main(String[] args) {

        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery("Medical equipment", "Karaganda");

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery("Furniture", "Aktau");
    }
}