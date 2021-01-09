package demo.ht.com.design_pattern.bridge_mode;

import android.util.Log;

/**
 * @ClassName Lenovo
 * 作者: szj
 * 时间: 2021/1/8 17:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 桥接模式 联想品牌
 */
public class Lenovo  extends ABrand {
    @Override
    public void info() {
        Log.i("桥接模式","联想");
    }
}
