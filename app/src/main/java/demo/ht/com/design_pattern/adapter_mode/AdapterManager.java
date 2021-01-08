package demo.ht.com.design_pattern.adapter_mode;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName AdapterManager
 * 作者: szj
 * 时间: 2021/1/8 15:20
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 适配器模式
 */
public class AdapterManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        //电脑
        Computer computer = new Computer();

        //网络
        Netting netting = new Netting();

        //转换器
        Adapter adapter = new Adapter(netting);

        computer.net(adapter);

    }
}
