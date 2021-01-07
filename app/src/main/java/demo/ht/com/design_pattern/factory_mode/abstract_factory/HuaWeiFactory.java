package demo.ht.com.design_pattern.factory_mode.abstract_factory;

/**
 * @ClassName HuaWeiFactory
 * 作者: szj
 * 时间: 2021/1/7 11:30
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 华为工厂类
 */
public  class HuaWeiFactory implements TotalFactory {
    @Override
    public IPhone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new HuaWeiComputer();
    }
}
