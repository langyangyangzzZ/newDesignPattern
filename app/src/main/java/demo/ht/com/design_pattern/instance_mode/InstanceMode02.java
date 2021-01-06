package demo.ht.com.design_pattern.instance_mode;

/**
 * @ClassName InstanceMode01
 * 作者: szj
 * 时间: 2021/1/6 14:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *      饿汉式(静态代码块)实现
 */
public class InstanceMode02 {
    //私有化构造器 外部不能  new
    private InstanceMode02(){}

    //类的内部实现创建对象
    private  static final InstanceMode02 instance;

    static {
        //静态代码块创建单利
        instance = new InstanceMode02();
    }

    //向外暴露一个静态方法
    public static InstanceMode02 getInstance(){
        return  instance;
    }
}
