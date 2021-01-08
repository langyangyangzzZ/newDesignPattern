package demo.ht.com.design_pattern.builder_mode.demo01;

/**
 * @ClassName Builder
 * 作者: szj
 * 时间: 2021/1/8 11:08
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 建造者模式 指挥流程
 */
public abstract class Builder {
    abstract void createA();//地基

    abstract void createB();//钢筋混凝土

    abstract void createC();//铺地砖

    abstract void createD();//粉刷

    //产品
    abstract House getHouse();
}
