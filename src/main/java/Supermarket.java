import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

    private Map<String, Fruit> fruits = new HashMap<>();
    private List<SalePromotion> promotions = new ArrayList<>();

    public void addFruit(String name, BigDecimal price){
        Fruit fruit = new Fruit(name, price);
        fruits.put(name, fruit);
    }

    public void addFruit(String name, BigDecimal price, BigDecimal discount){
        Fruit fruit = new Fruit(name, price, discount);
        fruits.put(name, fruit);
    }

    public void addSalePromotion(SalePromotion salePromotion){
        promotions.add(salePromotion);
    }

    public Map<String, Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(Map<String, Fruit> fruits) {
        this.fruits = fruits;
    }

    public List<SalePromotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<SalePromotion> promotions) {
        this.promotions = promotions;
    }
}
