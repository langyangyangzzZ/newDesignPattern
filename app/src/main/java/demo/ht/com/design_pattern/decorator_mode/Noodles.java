package demo.ht.com.design_pattern.decorator_mode;

/**
 * @ClassName Noodles
 * 作者: szj
 * 时间: 2021/1/9 16:58
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 面条类
 */
public class Noodles extends Food {
    public Noodles() {
        setName("面食");
        setPrice(9);
    }

    @Override
    public float totalPrice() {
        return getPrice();
    }
}
