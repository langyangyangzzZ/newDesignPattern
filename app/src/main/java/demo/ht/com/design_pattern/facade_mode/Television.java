package demo.ht.com.design_pattern.facade_mode;

import android.util.Log;

/**
 * @ClassName Television
 * 作者: szj
 * 时间: 2021/1/11 17:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 外观模式 电视类
 */
public class Television {
    private static Television instance = new Television();
    private Television(){}

    public static Television getInstance(){
        return  instance;
    }

    void open(){
        Log.i("外观模式","打开了电视");
    }

    void close(){
        Log.i("外观模式","关闭了电视");
    }
}
