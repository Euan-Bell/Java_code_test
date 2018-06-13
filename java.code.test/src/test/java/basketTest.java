
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class basketTest {

Basket shoppingBasket;
Item item;
Item item2;

@Before
public void before(){
    shoppingBasket = new Basket();
    item = new Item("Spam", 01.00);
    item2 = new Item("Cheese", 02.00);
}


@Test
    public void canCheckShoppingBasketCapacity(){
    assertEquals(0,shoppingBasket.getCapacity());
    }

@Test
    public void canAddItemToBasket(){
    shoppingBasket.addItem(item);
    assertEquals(1,shoppingBasket.getCapacity());
    }

@Test
    public void canAddSeveralItemsToBasket(){
    shoppingBasket.addItem(item);
    shoppingBasket.addItem(item2);
    assertEquals(2,shoppingBasket.getCapacity());
    }

 @Test
    public void canRemoveItemFromBasket(){
    shoppingBasket.addItem(item);
    shoppingBasket.removeItem(item);
    assertEquals(0,shoppingBasket.getCapacity());
    }

@Test
    public void canRemoveSeveralItemsFromBasket(){
    shoppingBasket.addItem(item);
    shoppingBasket.addItem(item2);
    shoppingBasket.removeItem(item);
    shoppingBasket.removeItem(item2);
    assertEquals(0,shoppingBasket.getCapacity());
    }
}
