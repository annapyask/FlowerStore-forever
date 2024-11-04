package ucu.edu.ua.appps.flower_lab8.decorator;

import ucu.edu.ua.appps.flower_lab8.model.Flower;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Flower item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + basket";
    }
}
