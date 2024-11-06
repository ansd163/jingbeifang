import java.math.BigDecimal;

/**
 * 水果信息
 */
public class Fruit {
    private String name;                //水果名
    private BigDecimal price;           //单价
    private BigDecimal discountRate;    //折扣率
    private String unit;                //单位


    public Fruit() {
    }

    public Fruit(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Fruit(String name, BigDecimal price, BigDecimal discountRate) {
        this.discountRate = discountRate;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
