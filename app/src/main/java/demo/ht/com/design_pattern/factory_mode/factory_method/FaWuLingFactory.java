package demo.ht.com.design_pattern.factory_mode.factory_method;

/**
 * @ClassName FWuLingFactory
 * 作者: szj
 * 时间: 2021/1/7 10:20
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 五菱工厂
 */
public class FaWuLingFactory implements FaFactory{
    @Override
    public FaCar createCar() {
        return new FaWuLing();
    }
}
