import java.util.ArrayList;
import java.util.List;
interface Cart {
    void pay(String payment);
}
class Group implements Cart {
    public void pay(String payment) {
        System.out.println("Group payment: " + payment);
    }
}
class OneCart implements Cart {
    public void pay(String payment) {
        System.out.println("OneCart payment: " + payment);
    }
}
class Pay implements Cart {
    private List<Cart> carts = new ArrayList<Cart>();
    public void pay(String payment) {
        for(Cart cart : carts) {
            cart.pay(payment);
        }
    }
    public void add(Cart s){
        this.carts.add(s);
    }
    public void clear(){
        System.out.println();
        this.carts.clear();
    }
}

public class Composite {

}