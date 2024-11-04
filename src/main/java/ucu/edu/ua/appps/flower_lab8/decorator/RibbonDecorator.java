package ucu.edu.ua.appps.flower_lab8.decorator;

import ucu.edu.ua.appps.flower_lab8.model.Flower;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Flower item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + ribbon";
    }
}
