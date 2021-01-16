package demo.ht.com.design_pattern.command_pattern;

/**
 * @ClassName CallCommand
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式 调用命令
 */
public class CallCommand {

    /**
     * 开命令
     */
    ICommand[] tvOnCommand;

    /**
     * 关命令
     */
    ICommand[] tvOffCommand;

    /**
     * 记录当前存放的命令 用来撤回
     */
    ICommand currentCommand;


    /**
     * 默认可存放5条命令
     */
    int number = 5;


    public CallCommand() {
        tvOnCommand = new ICommand[number];
        tvOffCommand = new ICommand[number];

        for (int i = 0; i < number; i++) {
            tvOnCommand[i] = new NoCommand();
            tvOffCommand[i] = new NoCommand();
        }
    }

    /**
     * @param index        当前存放的下标
     * @param OnCommand  开始下标
     * @param OffCommand 结束下标
     */
    public void setTvOnCommand(int index, ICommand OnCommand, ICommand OffCommand) {
        this.tvOnCommand[index] = OnCommand;
        this.tvOffCommand[index] = OffCommand;
    }

    /**
     * @param index 命令下标
     */
    public void getOnCommand(int index) {
        this.tvOnCommand[index].start();
        currentCommand =  this.tvOnCommand[index];
    }

    /**
     * @param index 命令下标
     */
    public void getOffCommand(int index) {
        this.tvOffCommand[index].start();
        currentCommand =  this.tvOffCommand[index];
    }

    /**
     * 撤回
     */
    public void getWithdraw() {
        currentCommand.withdraw();
    }
}
