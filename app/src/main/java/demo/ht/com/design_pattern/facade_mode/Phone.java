package demo.ht.com.design_pattern.facade_mode;

import android.util.Log;

/**
 * @ClassName Phone
 * 作者: szj
 * 时间: 2021/1/11 17:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 外观模式  手机类
 */
public class Phone {
    private static Phone instance = new Phone();
    private Phone(){}

    public static Phone getInstance(){
        return  instance;
    }

    void open(){
        Log.i("外观模式","打开了手机");
    }

    public void close(){
        Log.i("外观模式","关闭了手机");
    }

    public void connectWiFi(){
        Log.i("外观模式","手机 连接了WiFi");
    }
}
