package suggest.s09;

/**
 * 建议09：
 *     少用静态导入
 * @author Jerry
 * @create 2019-09-16 16:11
 */
public class Client {
    /**
     * 计算圆面积
     * @param r 半径
     * @return
     */
    public static double calCircleArea(double r){
        return Math.PI*r*r;
    }

    /**
     * 计算球的面积
     * @param r 半径
     * @return
     */
    public static double calBalArea(double r){
        return 4*Math.PI*r*r;
    }
}
