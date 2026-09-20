package abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}