package demo.ht.com.design_pattern.strategy_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName ToyDuck
 * 时间: 2021/1/27 10:02
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 策略模式 玩具鸭子
 */
public class ToyDuck extends Duck{
    public ToyDuck() {
        //玩具鸭子
        mFly = new NoFly();
    }

    @Override
    public void swimming() {
        Log.i("策略模式","玩具鸭子不会游泳");
    }
}
