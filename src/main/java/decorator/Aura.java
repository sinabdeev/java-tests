package decorator;

public class Aura extends OptionDecorator {
    public Aura(Service service, String label, double price) {
        super(service, label, price);
    }
}