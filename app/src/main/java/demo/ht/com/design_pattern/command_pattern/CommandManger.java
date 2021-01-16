package demo.ht.com.design_pattern.command_pattern;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName CommandManger
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式
 */
public class CommandManger implements DesignPattern {
    @Override
    public void showDesignPattern() {
        /*
         *角色分析:
         *
         * 将军发布命令 士兵执行命令 将军不会直接和士兵打交道,通过命令来 '连接' 将军和士兵
         *
         * Command 定义命令的接口，声明执行的方法。
         * TvOnCommand 指士兵 实现Command接口
         * TvOffCommand 指士兵  实现Command接口
         * DispatchOrders 是具体命令
         * CallCommand 是将军  调用者
         */

        /*
         * 电视机
         */

        //创建打开电视机命令具体内容
        CommandContent commandContent1 = new CommandContent("电视机");

        //初始化电视机开关命令
        TvOnCommand tvOnCommand = new TvOnCommand(commandContent1);
        TvOffCommand tvOffCommand = new TvOffCommand(commandContent1);

        //创建遥控器
        CallCommand callCommand = new CallCommand();
        //给遥控器初始化电视机开关命令
        callCommand.setTvOnCommand(0,tvOnCommand,tvOffCommand);

        //调用遥控器打开命令
        callCommand.getOnCommand(0);

        //调用遥控器关闭命令
        callCommand.getOffCommand(0);

        //调用遥控器撤回命令
        callCommand.getWithdraw();


        /*
         *  手机
         */

        //创建命令具体类容
        CommandContent commandContent2 = new CommandContent("手机");
        //创建手机命令
        PhoneOnCommand phoneOnCommand = new PhoneOnCommand(commandContent2);
        PhoneOffCommand phoneOffCommand = new PhoneOffCommand(commandContent2);

        //设置给遥控器命令
        callCommand.setTvOnCommand(1,phoneOnCommand,phoneOffCommand);

        //遥控器打开手机
        callCommand.getOnCommand(1);
        //遥控器关闭手机
        callCommand.getOffCommand(1);
        //遥控器打开手机
        callCommand.getOnCommand(1);
        //遥控器撤销
        callCommand.getWithdraw();
    }
}
