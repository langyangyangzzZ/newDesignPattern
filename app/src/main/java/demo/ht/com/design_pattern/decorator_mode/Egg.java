package demo.ht.com.design_pattern.decorator_mode;

/**
 * @ClassName Egg
 * 作者: szj
 * 时间: 2021/1/9 17:13
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 装饰类食物
 */
public class Egg extends GarnishFood{
    public Egg(Food food) {
        super(food);
        setName("鸡蛋");
        setPrice(1);
    }

    @Override
    public float totalPrice() {
//        getPrice() = 1
//       getFood().totalPrice() = 总价
        return  super.getPrice() +  super.getFood().totalPrice();
    }
}
