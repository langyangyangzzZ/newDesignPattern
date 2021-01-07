package demo.ht.com.design_pattern.factory_mode.abstract_factory;

import android.util.Log;

/**
 * @ClassName HuaWeiPhone
 * 作者: szj
 * 时间: 2021/1/7 11:02
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * //华为手机实现
 */
public class HuaWeiPhone implements IPhone{
    @Override
    public void open() {
        Log.i("Factory抽象工厂方法:","华为手机打开");
    }

    @Override
    public void wifi() {
        Log.i("Factory抽象工厂方法:","华为手机WIFI打开");
    }

    @Override
    public void sendSMS() {
        Log.i("Factory抽象工厂方法:","华为手机发送消息");
    }
}
