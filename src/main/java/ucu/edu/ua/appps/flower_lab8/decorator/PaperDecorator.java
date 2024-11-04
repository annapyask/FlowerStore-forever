package ucu.edu.ua.appps.flower_lab8.decorator;

import ucu.edu.ua.appps.flower_lab8.model.Flower;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Flower item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + paper";
    }
}
