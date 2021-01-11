package demo.ht.com.design_pattern.facade_mode;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName FacadeManager
 * 作者: szj
 * 时间: 2021/1/11 17:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 外观模式
 */
public class FacadeManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        Facade facade = new Facade();

        ////打开 空调 电脑 电视 手机
        facade.open();
        Log.i("外观模式","=====================");
        //连接手机WIFI
        facade.connectWiFi();

        Log.i("外观模式","=====================");

        facade.close();

    }
}
