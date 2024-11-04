package ucu.edu.ua.appps.flower_lab8.decorator;

import ucu.edu.ua.appps.flower_lab8.model.Flower;

public abstract class ItemDecorator extends Flower {
    protected Flower item;

    public ItemDecorator(Flower item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
