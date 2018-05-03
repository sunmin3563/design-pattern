package factory.factorymethod;


import factory.model.IBook;
import factory.model.JavaBcsx;

/**
 * @author sunmin
 * @date 2018/4/23 10:00
 */
public class JavaBcsxFactory implements Factory {
    @Override
    public IBook getBook() {
        return new JavaBcsx();
    }
}
