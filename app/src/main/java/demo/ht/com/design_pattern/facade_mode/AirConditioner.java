package demo.ht.com.design_pattern.facade_mode;

import android.util.Log;

/**
 * @ClassName AirConditioner
 * 作者: szj
 * 时间: 2021/1/11 17:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 外观模式 空调类
 */
public class AirConditioner {

    private static AirConditioner instance = new AirConditioner();
    private AirConditioner(){}

    public static AirConditioner getInstance(){
        return  instance;
    }

    public void open(){
        Log.i("外观模式","打开了空调");
    }

    public void close(){
        Log.i("外观模式","关闭了空调");
    }

}
