package demo.ht.com.design_pattern.factory_mode.ordinary_factory;

import android.util.Log;

/**
 * @ClassName Ordinary_WuLin
 * 作者: szj
 * 时间: 2021/1/7 9:49
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class OrdinaryWuLin extends OrdinaryCar {
    @Override
    public void CarName() {
        Log.i("Factory:简单工厂之:","五菱宏光");
    }
}
