package lcxy.demo.bospider.mainTest;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/11/8 下午3:02
 * @since JDK 1.8
 */


public class TestPython {

    public static void main(String args[]){
        //执行python脚本
        String[] arguments = new String[] {"python", "/Users/lcxy_demo/PycharmProjects/BoSpider/ThreadSpider/ThreadSpider.py", "java"};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
