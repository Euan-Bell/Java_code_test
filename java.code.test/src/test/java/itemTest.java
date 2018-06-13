import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class itemTest {

 Item item;
 Item item2;

 @Before
    public void before(){
     item = new Item("Beans", 05.00);
     item2 = new Item("Toast", 02.50);
 }

 @Test
    public void canGetItemName(){
     assertEquals("Beans", item.getName());
 }

 @Test
    public void canGetItemPrice(){
     assertEquals(05.00, item.getPrice(),00.01);
 }
}
