package demo.ht.com.design_pattern.observer_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Milk
 * 时间: 2021/1/21 13:38
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * 观察者模式 牛奶类
 */
public class MilkObserverImpl implements Observer{

    String food;

    public MilkObserverImpl(String food) {
        this.food = food;
    }

    @Override
    public void updata() {
        Log.i("观察者模式","饮料为:  "+food);
    }
}
