import java.math.BigDecimal;

/**
 * 减满策略
 */
public class SalePromotion {

    private BigDecimal price;
    private BigDecimal reducePrice;

    public SalePromotion() {

    }

    public SalePromotion(BigDecimal price, BigDecimal reducePrice) {
        this.price = price;
        this.reducePrice = reducePrice;
    }



    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }
}
