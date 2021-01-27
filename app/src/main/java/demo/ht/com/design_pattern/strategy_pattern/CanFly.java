package demo.ht.com.design_pattern.strategy_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName CanFly
 * 时间: 2021/1/27 10:07
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class CanFly implements Fly{
    @Override
    public void fly() {
        Log.i("策略模式","会飞翔");
    }
}
