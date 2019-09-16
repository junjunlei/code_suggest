package suggest.s03;

/**
 * 建议03：
 *     三元操作符类型务必一致
 * @author Jerry
 * @create 2019-09-16 11:27
 */
public class Client {
    public static void main(String[] args) {
        int i=80;
        String s1=String.valueOf(i<100?90:100);
        String s2=String.valueOf(i<100?90:100.0);
        //结果为false
        System.out.println("两者相等吗："+s1.equals(s2));
    }
}
