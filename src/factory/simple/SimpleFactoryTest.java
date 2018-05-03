package factory.simple;

/**
 * 简单工厂模式
 * @author sunmin
 * @date 2018/4/23 9:32
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        System.out.println(sf.getName("JAVA编程思想").getName());
    }
}
