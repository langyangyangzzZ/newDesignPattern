package demo.ht.com.design_pattern.factory_mode.abstract_factory;

import android.util.Log;

/**
 * @ClassName XiaoMiComputer
 * 作者: szj
 * 时间: 2021/1/7 11:06
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 小米电脑
 */
public class XiaoMiComputer implements IComputer{
    @Override
    public void study() {
        Log.i("Factory抽象工厂方法:","小米电脑学习");
    }

    @Override
    public void play() {
        Log.i("Factory抽象工厂方法:","小米电脑玩耍");
    }

    @Override
    public void WatchTv() {
        Log.i("Factory抽象工厂方法:","小米电脑看电视");
    }
}
