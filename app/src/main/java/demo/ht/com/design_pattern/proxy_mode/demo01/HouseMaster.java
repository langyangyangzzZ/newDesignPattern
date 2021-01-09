package demo.ht.com.design_pattern.proxy_mode.demo01;

import android.util.Log;

/**
 * @ClassName HouseMaster
 * 作者: szj
 * 时间: 2021/1/9 11:14
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 代理模式 房东
 */
public class HouseMaster implements IHouse {

    @Override
    public void showHouse() {
        Log.i("代理模式:", "我是房东,我要出租房");
    }
}
