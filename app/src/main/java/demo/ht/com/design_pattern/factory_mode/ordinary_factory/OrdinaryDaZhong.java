package demo.ht.com.design_pattern.factory_mode.ordinary_factory;

import android.util.Log;

/**
 * @ClassName OrdinaryDaZhong
 * 作者: szj
 * 时间: 2021/1/7 9:50
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class OrdinaryDaZhong extends OrdinaryCar {
    @Override
    public void CarName() {
        Log.i("Factory:简单工厂之:","大众汽车");
    }
}
