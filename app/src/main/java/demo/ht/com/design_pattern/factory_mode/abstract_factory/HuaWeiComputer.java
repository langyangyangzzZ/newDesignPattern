package demo.ht.com.design_pattern.factory_mode.abstract_factory;

import android.util.Log;

/**
 * @ClassName HuaWeiComputer
 * 作者: szj
 * 时间: 2021/1/7 11:06
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 华为电脑
 */
public class HuaWeiComputer implements IComputer{
    @Override
    public void study() {
        Log.i("Factory抽象工厂方法:","华为电脑学习");
    }
    @Override
    public void play() {
        Log.i("Factory抽象工厂方法:","华为电脑玩耍");
    }
    @Override
    public void WatchTv() {
        Log.i("Factory抽象工厂方法:","华为电脑看电视");
    }
}
