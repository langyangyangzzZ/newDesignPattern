package demo.ht.com.design_pattern.instance_mode;

/**
 * @ClassName InstanceMode01
 * 作者: szj
 * 时间: 2021/1/6 14:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *      饿汉式(静态常量)实现
 */
public class InstanceMode01 {
    //私有化构造器 外部不能  new
    private InstanceMode01(){}

    //类的内部实现创建对象
    private  static final InstanceMode01 instance = new InstanceMode01();

    //向外暴露一个静态方法
    public static InstanceMode01 getInstance(){
        return  instance;
    }
}
