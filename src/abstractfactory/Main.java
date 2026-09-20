package abstractfactory;

import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

public class Main {

    public static void main(String[] args) {

        if (args.length < 4) {
            System.out.println(
                    "Usage: java Main <ROAD|SEA> <WINDOWS|MACOS> <cargo> <destination>"
            );
            return;
        }

        String transportType = args[0].toUpperCase();
        String osType = args[1].toUpperCase();
        String cargo = args[2];
        String destination = args[3];

        Logistics logistics;

        if (transportType.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (transportType.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Invalid transport type. Use ROAD or SEA.");
            return;
        }

        GUIFactory guiFactory;

        if (osType.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (osType.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Invalid OS type. Use WINDOWS or MACOS.");
            return;
        }

        Application app = new Application(guiFactory, logistics);
        app.run(cargo, destination);
    }
}