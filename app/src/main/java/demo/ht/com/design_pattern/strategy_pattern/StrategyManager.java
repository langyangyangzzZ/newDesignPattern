package demo.ht.com.design_pattern.strategy_pattern;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName StrategyManager
 * 时间: 2021/1/27 10:00
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 策略模式
 */
public class StrategyManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

         // 玩具鸭
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.flyMethod();

        //野鸭子
        WildDuck wildDuck = new WildDuck();
        wildDuck.flyMethod();

        //旱鸭子
        DryDuck dryDuck = new DryDuck();
        dryDuck.flyMethod();

        //改变旱鸭子策略 可以飞翔
        dryDuck.setmFly(new CanFly());
        Log.i("策略模式","旱鸭子改变飞翔策略后 : ");
        dryDuck.flyMethod();

    }
}
