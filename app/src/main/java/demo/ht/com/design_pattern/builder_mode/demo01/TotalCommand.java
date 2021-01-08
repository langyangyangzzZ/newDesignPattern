package demo.ht.com.design_pattern.builder_mode.demo01;

/**
 * @ClassName TotalCommand
 * 作者: szj
 * 时间: 2021/1/8 11:16
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 建造者模式 总指挥
 */
public class TotalCommand {

    //返回产品
    public House build(Builder builder){
        builder.createD();
        builder.createC();
        builder.createA();
        builder.createB();
        return builder.getHouse();
    }
}
