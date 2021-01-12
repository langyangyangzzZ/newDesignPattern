package demo.ht.com.design_pattern.flyweight_mode;

/**
 * @ClassName IShape
 * 作者: szj
 * 时间: 2021/1/12 14:22
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 享元模式 抽象享元角色
 */
public interface IShape {
    //由客户端输入外部状态
    public void showShape(Color color);
}
