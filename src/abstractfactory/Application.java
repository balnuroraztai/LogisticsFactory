package abstractfactory;

import factorymethod.Logistics;

public class Application {

    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public Application(GUIFactory factory, Logistics logistics) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        this.logistics = logistics;
    }

    public void run(String cargo, String destination) {
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}