import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 订单
 */
public class Order {

    private BigDecimal price;               //原本金额
    private BigDecimal discountPrice;       //优惠金额
    private BigDecimal finallyPrice;        //优惠后的金额


    public Order() {
    }

    public BigDecimal getTotalPrice(Customer customer, Supermarket supermarket){

       BigDecimal totalPrice = BigDecimal.ZERO;

       for (ShopCart shopCart : customer.getShopCartMap().values()) {
           totalPrice = shopCart.getPrice().add(totalPrice);
       }

       this.price = totalPrice;
       this.discountPrice = calDiscountPrice(price, supermarket);
       this.finallyPrice = price.subtract(discountPrice);

       return finallyPrice;
   }

   //计算最佳优惠
   private BigDecimal calDiscountPrice(BigDecimal totalPrice, Supermarket supermarket){
       //优惠金额
       BigDecimal bastPrice = BigDecimal.ZERO;

       if (supermarket.getPromotions().isEmpty()){
           return bastPrice;
       }
       //计算最佳优惠
       for (SalePromotion promotion : supermarket.getPromotions()) {
           //达到优惠条件
           if (totalPrice.compareTo(promotion.getPrice()) > 0){
               //比之前优惠策略更佳
               if (promotion.getReducePrice().compareTo(bastPrice) > 0){
                   bastPrice = promotion.getReducePrice();
               }
           }
       }
       return bastPrice;
   }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getFinallyPrice() {
        return finallyPrice;
    }

    public void setFinallyPrice(BigDecimal finallyPrice) {
        this.finallyPrice = finallyPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }
}
