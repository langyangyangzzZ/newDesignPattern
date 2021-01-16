package demo.ht.com.design_pattern.command_pattern;

/**
 * @ClassName TvOnCommand
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式 电视机打开命令
 */
public class TvOnCommand implements ICommand{
    CommandContent dispatchOrders;

    public TvOnCommand(CommandContent dispatchOrders) {
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
