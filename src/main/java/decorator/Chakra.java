package decorator;

public class Chakra extends OptionDecorator {
    public Chakra(Service service, String label, double price) {
        super(service, label, price);
    }
}