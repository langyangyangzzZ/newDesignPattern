package demo.ht.com.design_pattern.factory_mode.factory_method;

/**
 * @ClassName FaTeSiLaFactory
 * 作者: szj
 * 时间: 2021/1/7 10:27
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class FaTeSiLaFactory implements FaFactory{
    @Override
    public FaCar createCar() {
        return new FaTeSiLa();
    }
}
