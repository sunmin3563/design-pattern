package proxy.custom;

import proxy.jdk.JDK58;
import proxy.jdk.XieMu;
import proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by Tom on 2018/3/10.
 */
public class CustomPorxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new XieMu());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
