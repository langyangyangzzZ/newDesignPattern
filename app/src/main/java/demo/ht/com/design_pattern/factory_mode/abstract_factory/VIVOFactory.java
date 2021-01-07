package demo.ht.com.design_pattern.factory_mode.abstract_factory;

/**
 * @ClassName VIVOFactory
 * 作者: szj
 * 时间: 2021/1/7 13:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class VIVOFactory implements TotalFactory {
    @Override
    public IPhone createPhone() {
        return new ViVoPhone();
    }

    @Override
    public IComputer createComputer() {
        return null;
    }
}
