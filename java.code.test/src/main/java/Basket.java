import java.util.ArrayList;

public class Basket {

    private ArrayList<Item>shoppingBasket;

    public Basket(){
        this.shoppingBasket = new ArrayList();
    }

    public int getCapacity() {
       return  shoppingBasket.size();
    }

    public void addItem(Item item) {
        shoppingBasket.add(item);

    }
}
