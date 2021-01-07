package demo.ht.com.design_pattern.factory_mode.factory_method;

import android.util.Log;

/**
 * @ClassName FaWuLing
 * 作者: szj
 * 时间: 2021/1/7 10:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class FaWuLing extends FaCar{
    @Override
    public void CarName() {
        Log.i("Factory:工厂方法之:","五菱汽车");
    }
}
