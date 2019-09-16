package suggest.s05;

/**
 * 建议05：
 *     别让null值和空值威胁到变长方法
 * @author Jerry
 * @create 2019-09-16 14:07
 */
public class Client {
    public void methodA(String str,Integer... itgs){

    }
    public void methodA(String str,String...strs){

    }

    public static void main(String[] args) {
        Client client=new Client();
        client.methodA("China",0);
        client.methodA("China","People");
        //编译报错  ambiguous method call 模糊的方法调用
        //client.methodA("China");
        //client.methodA("China",null);
    }
}
