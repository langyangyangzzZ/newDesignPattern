package demo.ht.com.design_pattern.instance_mode;

/**
 * @ClassName InstanceMode01
 * 作者: szj
 * 时间: 2021/1/6 14:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *    单利模式之静态内部类
 */
public class InstanceMode07 {

    /**
     * 私有化构造器 外部不能  new
     */
    private InstanceMode07(){}

    private static InstanceMode07 instance;

    //提供一个共有方法 使用到时才去创建intance
    public static synchronized InstanceMode07 getInstance(){
        return  SingletonInstance.INSTANCE;
    }

    //静态内部类
    public  static class SingletonInstance{
        private final static InstanceMode07 INSTANCE = new InstanceMode07();
    }

}
