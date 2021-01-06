package demo.ht.com.design_pattern.instance_mode;

/**
 * @ClassName InstanceMode01
 * 作者: szj
 * 时间: 2021/1/6 14:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *    懒汉式(线程安全,同步代码);
 */
public class InstanceMode04 {

    /**
     * 私有化构造器 外部不能  new
     */
    private InstanceMode04(){}

    private static InstanceMode04 instance;

    //提供一个共有方法 使用到时才去创建intance
    public static  synchronized InstanceMode04 getInstance(){
        if (instance == null) {
            instance = new InstanceMode04();
        }
        return instance;
    }
}
