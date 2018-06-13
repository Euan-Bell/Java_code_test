
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class basketTest {

Basket shoppingBasket;

@Before
public void before(){
    shoppingBasket = new Basket();
}


@Test
    public void canCheckShoppingBasketCapacity(){
    assertEquals(0,shoppingBasket.getCapacity());

}
}
