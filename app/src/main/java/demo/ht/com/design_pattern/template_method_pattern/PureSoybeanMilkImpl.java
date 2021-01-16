package demo.ht.com.design_pattern.template_method_pattern;

import android.util.Log;

/**
 * @ClassName PureSoybeanMilkImpl
 * 作者: szj
 * 时间: 2021/1/15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 模板方法模式 纯豆浆制作
 */
public class PureSoybeanMilkImpl extends ATemplate {
    @Override
    public void addBean() {
        Log.i("模板方法模式 ","我这里什么都不加,我要喝纯豆浆");
    }
    //不加糖
    @Override
    public boolean isSugar() {

        return false;
    }
}
