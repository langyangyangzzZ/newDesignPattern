package demo.ht.com.design_pattern.command_pattern;

import android.util.Log;

/**
 * @ClassName DispatchOrders
 * 作者: szj
 * 时间: 2021/1/16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 命令模式 具体命令内容
 */
public class CommandContent {
    String type;

    //传递的是家电 比如说电视
    public CommandContent(String type) {
        this.type = type;
    }

    public void on(){
        Log.i("命令模式",type+"  打开了~ ");
    }
    public void off(){
        Log.i("命令模式",type+"  关闭了~ ");
    }
}
