package demo.ht.com.design_pattern.strategy_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName WildDuck
 * 时间: 2021/1/27 10:01
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 策略模式 野鸭子
 */
public class WildDuck extends Duck{

    public WildDuck() {
        //野鸭子会飞
        mFly = new CanFly();
    }

    @Override
    public void swimming() {
        Log.i("策略模式","野鸭子会游泳");
    }
}
