package demo.ht.com.design_pattern.template_method_pattern;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName TemplateManager
 * 作者: szj
 * 时间: 2021/1/15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 模板方法模式管理类
 */
public  class TemplateManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        //制作黑豆浆
        ATemplate blackSoybeanMilk = new BlackSoybeanMilkImpl();
        blackSoybeanMilk.aemplate();

        Log.i("模板方法模式 "," ===========================");

        //制作红豆浆
        RedSoybeanMilkImpl redSoybeanMilk = new RedSoybeanMilkImpl();
        redSoybeanMilk.aemplate();


        Log.i("模板方法模式 "," ===========================");

        //制作纯豆浆  使用钩子 不加糖
        PureSoybeanMilkImpl pureSoybeanMilk = new PureSoybeanMilkImpl();
        pureSoybeanMilk.aemplate();


    }
}
