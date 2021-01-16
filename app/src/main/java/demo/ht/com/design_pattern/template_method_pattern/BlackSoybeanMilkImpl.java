package demo.ht.com.design_pattern.template_method_pattern;

import android.util.Log;

/**
 * @ClassName BlackSoybeanMilkImpl
 * 作者: szj
 * 时间: 2021/1/15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 模板方法模式 黑豆浆
 */
public class BlackSoybeanMilkImpl extends ATemplate {

    @Override
    public void addBean() {
        Log.i("模板方法模式 ","放入 黑豆浆");
    }
}                         
