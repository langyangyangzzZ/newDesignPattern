package demo.ht.com.design_pattern.decorator_mode;

/**
 * @ClassName food
 * 作者: szj
 * 时间: 2021/1/9 16:51
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public abstract class Food {
    private String name;//名字
    private float price;//价格

    //总价
    public abstract float totalPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
