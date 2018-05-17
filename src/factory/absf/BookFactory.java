package factory.absf;


import factory.model.IBook;
import factory.model.JavaBcsx;
import factory.model.Sfdl;

/**
 * @author sunmin
 * @date 2018/4/23 10:17
 */
public class BookFactory extends AbstractFactory {

    @Override
    public IBook getJavaBcsx() {
        return new JavaBcsx();
    }

    @Override
    public IBook getSfdl() {
        return new Sfdl();
    }

}
