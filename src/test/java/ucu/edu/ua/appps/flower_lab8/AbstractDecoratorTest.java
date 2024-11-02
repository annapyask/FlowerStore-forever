package ucu.edu.ua.appps.flower_lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.appps.flower_lab8.decorator.AbstractDecorator;
import ucu.edu.ua.appps.flower_lab8.model.Flower;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicDecorator extends AbstractDecorator {
    public BasicDecorator(Flower flower) {
        super(flower);
    }
}
class AbstractDecoratorTest {

    private Flower baseFlower;
    private BasicDecorator basicDecorator;

    @BeforeEach
    void setUp() {
        baseFlower = new Flower();
        baseFlower.setName("Rose");
        baseFlower.setPrice(20.0);
        
        basicDecorator = new BasicDecorator(baseFlower);
    }

    @Test
    void testGetName() {
        assertEquals("Rose", basicDecorator.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(20.0, basicDecorator.getPrice());
    }
}