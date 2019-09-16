package suggest.s02;

import java.util.Random;

/**
 * 建议02：
 * 莫让常量蜕变为变量
 *
 * @author Jerry
 * @create 2019-09-16 11:02
 */
public class Client {
    public static void main(String[] args) {
        /*常量必须在编译期就确定其值,不应该在运行期改变*/
        System.out.println("这里的常量会变：" + Const.RAND_CONST);
    }
}
/**
 * 接口常量
 */
interface Const {
    /**
     * 这还是常量吗？
     * 是常量，但这种定义常量的方式极不可取
     */
    public static final int RAND_CONST = new Random().nextInt(100);
}
