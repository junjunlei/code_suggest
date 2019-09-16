package suggest.s10;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

/**
 * 建议10：
 *    不要在本类中覆静态导入的变量和方法
 * @author Jerry
 * @create 2019-09-16 16:38
 */
public class Client {
    public static final String PI = "PI";

    public static int abs(int num) {
        return 0;
    }

    public static void main(String[] args) {
        //结果 PI
        System.out.println("PI=" + PI);
        //结果 0
        System.out.println("abs(-100)=" + abs(-100));
    }
}
