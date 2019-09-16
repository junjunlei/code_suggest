package suggest.s06;

import java.util.Arrays;

/**
 * 建议06：
 *     覆写变长方法也要循规蹈矩
 * @author Jerry
 * @create 2019-09-16 14:47
 */
public class Client {
    public static void main(String[] args) {
        //向上转型 形参列表由父类决定
        //在编译时。"base.fun(100,50)中的50这个实参会被编译器“猜测”而编译成{50}数组"再由子类sub.fun执行
        Base base=new Sub();
        base.fun(100,50);
        //不转型
        Sub sub=new Sub();
        //调用的是子类的fun方法 ，50这里编译报错
        //cannot be applied
        /*这里编译器并不会把50转换成数组，因为数组本身就是一个对象，编译器并不会聪明到把两个没有
         继承关系的类之间做转换，Java严格要求类型匹配的，类型不匹配编译器自然就会拒绝执行*/
        //sub.fun(100, 50);
    }
}
class Base{
    void fun(int price,int...discounts){
        System.out.println("基类的fun方法");
    }
}
class Sub extends Base{
    /**
     * 重写的时候不会报错
     * @param price
     * @param discounts
     */
    @Override
    void fun(int price, int[] discounts) {
        System.out.println("子类的fun方法");
    }
}