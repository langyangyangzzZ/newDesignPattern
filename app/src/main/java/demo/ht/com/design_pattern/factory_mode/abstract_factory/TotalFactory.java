package demo.ht.com.design_pattern.factory_mode.abstract_factory;

/**
 * @ClassName IgoodsType
 * 作者: szj
 * 时间: 2021/1/7 11:45
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 抽象总工厂类
 */
public interface TotalFactory {
    /**
     * 创建手机系列
     */
    IPhone createPhone();

    /**
     * 创建电脑系列
     */
    IComputer createComputer();
}
