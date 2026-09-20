package factorymethod;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering cargo by sea in a ship.");
    }
}