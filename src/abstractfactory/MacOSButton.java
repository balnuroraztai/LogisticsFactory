package abstractfactory;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering a macOS button.");
    }
}