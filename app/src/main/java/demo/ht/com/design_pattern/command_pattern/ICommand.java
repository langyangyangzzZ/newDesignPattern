package demo.ht.com.design_pattern.command_pattern;

/**
 * @ClassName ICommand
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式 接口
 */
public interface ICommand {
    /**
     * 开始
     */
    public void start();

    /**
     * 撤销
     */
    public void withdraw();
}
