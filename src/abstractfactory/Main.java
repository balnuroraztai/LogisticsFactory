package abstractfactory;

import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose transport (ROAD/SEA): ");
        String transportType = scanner.nextLine().toUpperCase();

        System.out.print("Choose OS (WINDOWS/MACOS): ");
        String osType = scanner.nextLine().toUpperCase();

        String cargo = "Cargo";
        String destination = "Karaganda";

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

        scanner.close();
    }
}