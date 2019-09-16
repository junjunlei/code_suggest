package suggest.s08;
/**
 * 建议08：
 *    不要被旧语法困扰
 * @author Jerry
 * @create 2019-09-16 15:58
 */
public class Client {
    public static void methodA(){
        System.out.println("方法A执行了");
        //C中的goto语法，Java已经摒弃，用break,continue替代，但是保留了goto关键字
        methodA:methodB();
    }
    public static void methodB(){
        System.out.println("方法B执行了");
    }

    public static void main(String[] args) {
        //输出结果：
        //方法A执行了
        //方法B执行了
        methodA();
    }
}
