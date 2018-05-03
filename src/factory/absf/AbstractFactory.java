package factory.absf;


import factory.model.IBook;

/**
 * @author sunmin
 * @date 2018/4/23 10:15
 */
public abstract class AbstractFactory {
    public abstract IBook getJavaBcsx();
    public abstract IBook getSfdl();
}
