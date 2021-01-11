package demo.ht.com.design_pattern.decorator_mode;

/**
 * @ClassName Bacon
 * 作者: szj
 * 时间: 2021/1/11 10:48
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Bacon extends GarnishFood{
    public Bacon(Food food) {
        super(food);
        setName("培根");
        setPrice(3.5f);
    }

    @Override
    public float totalPrice() {
        return super.getPrice() + super.getFood().totalPrice();
    }
}
