
import java.security.Permission;

public class MySecurityManager extends SecurityManager{
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
        System.out.println(perm);
//        super.checkPermission(perm);
    }
    //检测程序是否可执行
    @Override
    public void checkExec(String cmd) {
        super.checkExec("checkExec 权限异常" + cmd);
    }
    //检测程序是否允许读文件
    @Override
    public void checkRead(String file) {
        System.out.println(file);
        if (file.contains("D:\\springboottest\\bubble-code-sandbox")){
            return;
        }
        super.checkRead("checkRead 权限异常" + file);
    }
    //检测程序是否允许写文件
    @Override
    public void checkWrite(String file) {
        super.checkWrite("checkWrite 权限异常"+file);
    }
    //检测程序是否允许删除文件
    @Override
    public void checkDelete(String file) {
        super.checkDelete("checkDelete 权限异常"+file);
    }
    //检测程序是否允许连接网络
    @Override
    public void checkConnect(String host, int port) {
        throw  new SecurityException("checkConnect 权限异常" + host + ":" + port);
    }
}
