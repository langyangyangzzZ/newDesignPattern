package demo.ht.com.design_pattern.bridge_mode;

import android.util.Log;

/**
 * @ClassName Notebook
 * 作者: szj
 * 时间: 2021/1/8 17:21
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 桥接模式 笔记本
 */
public class Notebook extends AType {
    private ABrand brand;
    public Notebook(ABrand brand) {
        this.brand = brand;
    }
    @Override
    public void type() {
        brand.info();
        Log.i("桥接模式:","笔记本");
    }
}
