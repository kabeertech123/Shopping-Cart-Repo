import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {

    Map<String, Double> map = new HashMap<>();
    String name;
    double price;
    int id; 

    ShoppingCart(String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;

    }

    void viewShoppingCart(){
        for(Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() +  " price:  " + entry.getValue());
    }
}
    void addItem(String name, double price){

        map.put(name,price);
        

    }

    void removeItem(String name){
        
        map.remove(name);
    }


}



