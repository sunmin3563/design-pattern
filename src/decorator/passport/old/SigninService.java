package decorator.passport.old;

/**
 * Created by Tom on 2018/3/17.
 */
public class SigninService implements ISigninService {
    @Override
    public ResultMsg regist(String username,String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg login(String username,String password){
        return null;
    }
}
