package demo.ht.com.design_pattern.factory_mode.abstract_factory;

import android.util.Log;

/**
 * @ClassName XiaoMiPhone
 * 作者: szj
 * 时间: 2021/1/7 11:02
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 小米手机类
 */
public class XiaoMiPhone implements IPhone{
    @Override
    public void open() {
        Log.i("Factory抽象工厂方法:","小米手机打开");
    }

    @Override
    public void wifi() {
        Log.i("Factory抽象工厂方法:","小米手机WIFI打开");
    }

    @Override
    public void sendSMS() {
        Log.i("Factory抽象工厂方法:","小米手机发送消息");
    }
}
