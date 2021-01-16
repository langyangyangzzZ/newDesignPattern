package demo.ht.com.design_pattern.command_pattern;

/**
 * @ClassName PhoneOffCommand
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式 手机关闭
 */
public class PhoneOffCommand implements ICommand{

    CommandContent dispatchOrders;

    public PhoneOffCommand(CommandContent dispatchOrders) {
        this.dispatchOrders = dispatchOrders;
    }

    @Override
    public void start() {
        dispatchOrders.off();
    }

    @Override
    public void withdraw() {
        dispatchOrders.on();
    }
}
