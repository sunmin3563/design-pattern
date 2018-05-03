package factory.factorymethod;


import factory.model.IBook;
import factory.model.Sfdl;

/**
 * @author sunmin
 * @date 2018/4/23 10:02
 */
public class SfdlFactory implements Factory {
    @Override
    public IBook getBook() {
        return new Sfdl();
    }
}
