package demo.ht.com.design_pattern.bridge_mode;

import demo.ht.com.design_pattern.adapter_mode.Netting;
import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName BridgeManager
 * 作者: szj
 * 时间: 2021/1/8 17:16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *  桥接模式
 */
public class BridgeManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        //电脑 品牌
        Computer computer = new Computer(new Lenovo());
        computer.type();

        Notebook notebook = new Notebook(new Dell());
        notebook.type();
    }
}
