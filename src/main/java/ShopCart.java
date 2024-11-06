import java.math.BigDecimal;

/**
 * 购物车
 */
public class ShopCart {
    private Fruit fruit;
    private BigDecimal num;
    private BigDecimal price;

    public ShopCart() {

    }

    public ShopCart(Fruit fruit, BigDecimal num) {
        this.fruit = fruit;
        this.num = num;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
