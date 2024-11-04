package ucu.edu.ua.appps.flower_lab8;

import org.junit.jupiter.api.Test;

import ucu.edu.ua.appps.flower_lab8.decorator.BasketDecorator;
import ucu.edu.ua.appps.flower_lab8.decorator.PaperDecorator;
import ucu.edu.ua.appps.flower_lab8.decorator.RibbonDecorator;
import ucu.edu.ua.appps.flower_lab8.model.Flower;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemDecoratorTest {

    @Test
    public void testBasketDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(50.0);

        Flower decoratedFlower = new BasketDecorator(flower);

        assertEquals(54.0, decoratedFlower.getPrice());
        assertEquals("Rose + basket", decoratedFlower.getDescription());
    }

    @Test
    public void testPaperDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(50.0);

        Flower decoratedFlower = new PaperDecorator(flower);

        assertEquals(63.0, decoratedFlower.getPrice());
        assertEquals("Rose + paper", decoratedFlower.getDescription());
    }

    @Test
    public void testRibbonDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(50.0);

        Flower decoratedFlower = new RibbonDecorator(flower);

        assertEquals(90.0, decoratedFlower.getPrice());
        assertEquals("Rose + ribbon", decoratedFlower.getDescription());
    }

    @Test
    public void testMultipleDecorators() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(50.0);

        Flower decoratedFlower = new RibbonDecorator(new PaperDecorator(new BasketDecorator(flower)));

        assertEquals(107.0, decoratedFlower.getPrice());
        assertEquals("Rose + basket + paper + ribbon", decoratedFlower.getDescription());
    }
}
