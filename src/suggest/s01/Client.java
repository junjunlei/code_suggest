package suggest.s01;
/**
 * 建议01：
 *  不要在常量和变量中出现容易混淆的字母
 * @author Jerry
 * @create 2019-09-16 11:00
 */
public class Client {
    public static void main(String[] args) {
        //l容易与1混淆,应该用L来标识长整型
        long i=1l;
        //结果是2
        System.out.println("i的两倍是"+(i+i));
    }
}
