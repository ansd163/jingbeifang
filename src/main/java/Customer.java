import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private Map<String, ShopCart> shopCartMap = new HashMap<>();

    public void add(Fruit fruit, BigDecimal num) {

        ShopCart shopCart;
        if (shopCartMap.containsKey(fruit.getName())){
            shopCart = shopCartMap.get(fruit.getName());
            shopCart.setNum(shopCart.getNum().add(num));
        }else {
            shopCart = new ShopCart(fruit, num);
        }

        //单种水果总价格
        BigDecimal fruitPrice = fruit.getPrice().multiply(num);
        //计算折扣
        BigDecimal discountRate = fruit.getDiscountRate();
        if (discountRate != null && discountRate.compareTo(BigDecimal.ZERO) > 0){
            fruitPrice = fruitPrice.multiply(discountRate).divide(new BigDecimal(10), 2, BigDecimal.ROUND_HALF_UP);
        }
        shopCart.setPrice(fruitPrice);

        shopCartMap.put(fruit.getName(), shopCart);
    }

    public Map<String, ShopCart> getShopCartMap() {
        return shopCartMap;
    }

    public void setShopCartMap(Map<String, ShopCart> shopCartMap) {
        this.shopCartMap = shopCartMap;
    }
}
