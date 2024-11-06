import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

public class Demo {
    @Test
    public void test01(){
        //超市
        Supermarket supermarket = new Supermarket();

        //水果清单
        supermarket.addFruit("苹果", new BigDecimal(8));
        supermarket.addFruit("草莓", new BigDecimal(13));

        //顾客
        Customer customer = new Customer();
        Map<String, Fruit> fruits = supermarket.getFruits();
        //购买
        customer.add(fruits.get("苹果"), new BigDecimal(1));
        customer.add(fruits.get("草莓"), new BigDecimal(2));

        //结账
        Order order = new Order();
        BigDecimal totalPrice = order.getTotalPrice(customer, supermarket);
        System.out.println(totalPrice);
    }

    @Test
    public void test02(){
        //超市
        Supermarket supermarket = new Supermarket();

        //水果清单
        supermarket.addFruit("苹果", new BigDecimal(8));
        supermarket.addFruit("草莓", new BigDecimal(13));
        supermarket.addFruit("芒果", new BigDecimal(20));//新增

        //顾客
        Customer customer = new Customer();
        Map<String, Fruit> fruits = supermarket.getFruits();
        //购买
        customer.add(fruits.get("苹果"), new BigDecimal(1));
        customer.add(fruits.get("草莓"), new BigDecimal(2));
        customer.add(fruits.get("芒果"), new BigDecimal(3));//新增

        //结账
        Order order = new Order();
        BigDecimal totalPrice = order.getTotalPrice(customer, supermarket);
        System.out.println(totalPrice);
    }

    @Test
    public void test03(){
        //超市
        Supermarket supermarket = new Supermarket();

        //水果清单
        supermarket.addFruit("苹果", new BigDecimal(8));
        supermarket.addFruit("草莓", new BigDecimal(13), new BigDecimal(8));//打8折
        supermarket.addFruit("芒果", new BigDecimal(20));


        //顾客
        Customer customer = new Customer();
        Map<String, Fruit> fruits = supermarket.getFruits();
        //购买
        customer.add(fruits.get("苹果"), new BigDecimal(1));
        customer.add(fruits.get("草莓"), new BigDecimal(2));
        customer.add(fruits.get("芒果"), new BigDecimal(3));//新增

        //结账
        Order order = new Order();
        BigDecimal totalPrice = order.getTotalPrice(customer, supermarket);
        System.out.println(totalPrice);
    }

    @Test
    public void test04(){
        //超市
        Supermarket supermarket = new Supermarket();

        //水果清单
        supermarket.addFruit("苹果", new BigDecimal(8));
        supermarket.addFruit("草莓", new BigDecimal(13), new BigDecimal(8));//打8折
        supermarket.addFruit("芒果", new BigDecimal(20));

        //促销策略
        supermarket.addSalePromotion(new SalePromotion(new BigDecimal(100), new BigDecimal(10)));
        //supermarket.addSalePromotion(new SalePromotion(new BigDecimal(100), new BigDecimal(20)));

        //顾客
        Customer customer = new Customer();
        Map<String, Fruit> fruits = supermarket.getFruits();
        //购买
        customer.add(fruits.get("苹果"), new BigDecimal(7));
        customer.add(fruits.get("草莓"), new BigDecimal(4));
        customer.add(fruits.get("芒果"), new BigDecimal(3));//新增

        //结账
        Order order = new Order();
        BigDecimal totalPrice = order.getTotalPrice(customer, supermarket);
        System.out.println(totalPrice);
    }
}
