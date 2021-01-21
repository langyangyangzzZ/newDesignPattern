package demo.ht.com.design_pattern.observer_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName CocaColaObserverImpl
 * 时间: 2021/1/21 14:34
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class CocaColaObserverImpl implements Observer{

    String food;

    public CocaColaObserverImpl(String food) {
        this.food = food;
    }

    @Override
    public void update() {
        Log.i("观察者模式","饮料为:  "+food);
    }
}
