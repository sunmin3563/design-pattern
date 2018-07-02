package delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tom on 2018/3/14.
 */
public class Leader implements  ITarget {

    private Map<String,ITarget> targets = new HashMap<String,ITarget>();

    public Leader() {
        targets.put("加密",new delegate.leader.TargetA());
        targets.put("登录",new delegate.leader.TargetB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
