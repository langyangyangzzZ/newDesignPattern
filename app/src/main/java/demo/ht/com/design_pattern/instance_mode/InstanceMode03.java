package demo.ht.com.design_pattern.instance_mode;

/**
 * @ClassName InstanceMode01
 * 作者: szj
 * 时间: 2021/1/6 14:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *    懒汉式(线程不安全);
 */
public class InstanceMode03 {

    /**
     * 私有化构造器 外部不能  new
     */
    private InstanceMode03(){}

    private static  InstanceMode03 instance;

    //提供一个共有方法 使用到时才去创建intance
    public static InstanceMode03 getInstance(){
        if (instance == null) {
            instance = new InstanceMode03();
        }
        return instance;
    }
}
