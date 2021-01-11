package demo.ht.com.design_pattern.facade_mode;

import android.util.Log;

/**
 * @ClassName Computer
 * 作者: szj
 * 时间: 2021/1/11 17:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 外观模式 电脑类
 */
public class Computer {
    private static Computer instance = new Computer();
    private Computer(){}

    public static Computer getInstance(){
        return  instance;
    }

    public void open(){
        Log.i("外观模式","打开了电脑");
    }

    public void close(){
        Log.i("外观模式","关闭了电脑");
    }
}
