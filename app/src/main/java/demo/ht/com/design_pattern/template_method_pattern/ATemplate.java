package demo.ht.com.design_pattern.template_method_pattern;

import android.util.Log;

/**
 * @ClassName ATemplate
 * 作者: szj
 * 时间: 2021/1/15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 模板方法模式 豆浆规范流程
 */
public abstract class ATemplate {

    //用来规范豆浆流程
    void aemplate() {
        soybean();//准备黄豆
        addBean();//添加豆子
        if (isSugar()) {
            sugar();  //准备冰糖
        }
        polish(); //打豆浆

    }

    //准备黄豆
    private void soybean() {
        Log.i("模板方法模式 ", "准备黄豆");
    }


    //添加豆子
    public abstract void addBean();

    //准备冰糖
    private void sugar() {
        Log.i("模板方法模式 ", "放入冰糖");
    }


    //打豆浆
    private void polish() {
        Log.i("模板方法模式 ", "开始打磨豆浆 预计10分钟完毕");
    }


    //默认加糖
    public boolean isSugar() {
        return true;
    }
}
