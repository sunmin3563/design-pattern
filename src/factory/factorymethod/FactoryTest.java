package factory.factorymethod;

/**
 * 工厂方法模式
 * @author sunmin
 * @date 2018/4/23 10:04
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory f = new JavaBcsxFactory();
        System.out.println(f.getBook());
    }
}
