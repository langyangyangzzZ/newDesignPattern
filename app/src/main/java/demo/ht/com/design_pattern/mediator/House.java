package demo.ht.com.design_pattern.mediator;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName House
 * 时间: 2021/1/23 11:24
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 中介者模式 房屋类
 */
public abstract class House {
    //中介者抽象类
    public Mediator mediator;

    public House(Mediator mediator) {
        this.mediator = mediator;
    }
    //输出消息
    public abstract void sendInfo(String  info);

    //获取房东发送的消息 (打印消息时使用)
    protected abstract String getInfo();
}
