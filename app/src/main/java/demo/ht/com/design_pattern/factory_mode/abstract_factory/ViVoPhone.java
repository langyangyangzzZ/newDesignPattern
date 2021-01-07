package demo.ht.com.design_pattern.factory_mode.abstract_factory;

import android.util.Log;

/**
 * @ClassName ViVoPhone
 * 作者: szj
 * 时间: 2021/1/7 13:18
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * VIVO手机
 */
public class ViVoPhone implements IPhone {

    @Override
    public void open() {
        Log.i("Factory抽象工厂方法:", "VIVO手机打开");
    }

    @Override
    public void wifi() {
        Log.i("Factory抽象工厂方法:", "VIVO手机连接WIFi");
    }

    @Override
    public void sendSMS() {
        Log.i("Factory抽象工厂方法:", "VIVO手机发送消息");
    }
}
