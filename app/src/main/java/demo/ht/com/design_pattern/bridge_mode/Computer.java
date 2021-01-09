package demo.ht.com.design_pattern.bridge_mode;

import android.util.Log;

/**
 * @ClassName Computer
 * 作者: szj
 * 时间: 2021/1/8 17:20
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 桥接模式 电脑类
 */
public class Computer extends AType {

    private ABrand brand;//相当于桥 品牌

    public Computer(ABrand brand) {
        this.brand = brand;
    }

    @Override
    public void type() {
        brand.info();
        Log.i("桥接模式:","电脑");
    }
}
