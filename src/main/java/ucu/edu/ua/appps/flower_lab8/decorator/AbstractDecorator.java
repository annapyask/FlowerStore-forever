package ucu.edu.ua.appps.flower_lab8.decorator;

import ucu.edu.ua.appps.flower_lab8.model.Flower;

public abstract class AbstractDecorator extends Flower {
    protected Flower flower;

    public AbstractDecorator(Flower flower) {
        this.flower = flower;
    }

    @Override
    public String getName() {
        return flower.getName();
    }

    @Override
    public Double getPrice() {
        return flower.getPrice();
    }
}
