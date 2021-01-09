package demo.ht.com.design_pattern.bridge_mode;

import android.util.Log;

/**
 * @ClassName Dell
 * 作者: szj
 * 时间: 2021/1/8 17:18
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 桥接模式 Dell品牌
 *
 */
public class Dell extends ABrand {
    @Override
    public void info() {
        Log.i("桥接模式","戴尔");
    }
}
