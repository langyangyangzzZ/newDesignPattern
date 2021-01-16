package demo.ht.com.design_pattern.command_pattern;

/**
 * @ClassName PhoneOnCommand
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式 手机打开
 */
public class PhoneOnCommand implements ICommand{

    CommandContent dispatchOrders;

    public PhoneOnCommand(CommandContent dispatchOrders) {
        this.dispatchOrders = dispatchOrders;
    }

    @Override
    public void start() {
        dispatchOrders.on();
    }

    @Override
    public void withdraw() {
        dispatchOrders.off();
    }
}
