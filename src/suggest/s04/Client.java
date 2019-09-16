package suggest.s04;

import java.text.NumberFormat;

/**
 * 建议04：
 *     避免带有变长参数的方法重载
 * @author Jerry
 * @create 2019-09-16 13:02
 */
public class Client {
    /**
     * 简单折扣计算
     * @param price 原价
     * @param discount 折扣
     */
    public void calPrice(int price,int discount){
        //折后价
        float knockdownPrice=price*discount/100.0F;
        System.out.println("简单折扣后的价格是："+formatCurrency(knockdownPrice));
    }

    /**
     * 复杂多折扣计算(折上折)
     * @param price 原件
     * @param discounts 折扣
     */
    public void calPrice(int price,int... discounts){

        float knockdownPrice=price;
        for(int discount:discounts){
            knockdownPrice=knockdownPrice*discount/100;
        }
        System.out.println("复杂折扣后的价格是"+formatCurrency(knockdownPrice));
    }
    /**
     *格式化成本的货币形式
     * @param price 原价
     * @return 货币格式化后的结果
     */
    private String formatCurrency(float price){
        return NumberFormat.getCurrencyInstance().format(price/100);
    }

    public static void main(String[] args) {
        Client client=new Client();
        //499元的货物，打75折，结果 ￥374.25
        client.calPrice(49900,75);
    }
}
