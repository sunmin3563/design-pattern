package factory.absf;

/**
 * 抽象工厂模式
 * @author sunmin
 * @date 2018/4/23 10:19
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        BookFactory b = new BookFactory();
        System.out.println(b.getJavaBcsx().getName());
    }
}
