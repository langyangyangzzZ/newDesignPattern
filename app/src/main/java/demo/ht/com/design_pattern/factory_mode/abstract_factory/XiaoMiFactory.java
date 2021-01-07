package demo.ht.com.design_pattern.factory_mode.abstract_factory;

/**
 * @ClassName XiaoMiFactory
 * 作者: szj
 * 时间: 2021/1/7 11:32
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 抽象小米工厂类
 */
public  class XiaoMiFactory implements TotalFactory {

    @Override
    public IPhone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new XiaoMiComputer();
    }
}
