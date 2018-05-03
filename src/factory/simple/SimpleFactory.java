package factory.simple;


import factory.model.IBook;
import factory.model.JavaBcsx;
import factory.model.Sfdl;

/**
 * @author sunmin
 * @date 2018/4/23 9:32
 */
public class SimpleFactory {
    public IBook getName(String name){
        String javabcsx = "JAVA编程思想";
        String sfdl = "算法导论";
        if(javabcsx.equals(name)){
            return new JavaBcsx();
        } else if(sfdl.equals(name)){
            return new Sfdl();
        } else{
            System.out.println("没有所对应的书籍");
            return null;
        }
    }
}
