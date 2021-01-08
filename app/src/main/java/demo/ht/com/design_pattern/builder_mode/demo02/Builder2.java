package demo.ht.com.design_pattern.builder_mode.demo02;

/**
 * @ClassName Builder2
 * 作者: szj
 * 时间: 2021/1/8 11:26
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 可选择食物
 */
public abstract class Builder2 {

    public abstract Builder2 createA(String msg);//汉堡
    public abstract Builder2 createB(String msg);//薯条
    public abstract Builder2 createC(String msg);//可乐
    public  abstract Builder2 createD(String msg);//鸡翅


    public abstract Product buildProduct();

}
