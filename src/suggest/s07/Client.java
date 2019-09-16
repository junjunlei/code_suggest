package suggest.s07;
/**
 *建议07：
 *    警惕自增的陷阱
 * @author Jerry
 * @create 2019-09-16 15:22
 */
public class Client {
    public static void main(String[] args) {
        int count1=0;
        int count2=0;
        int num=10;
        for (int i=0;i<num;i++){
            count1=count1++;
            count2++;
        }
        //输出结果 0
        System.out.println("count1="+count1);
        //输出结果 10
        System.out.println("count2="+count2);
    }
}
