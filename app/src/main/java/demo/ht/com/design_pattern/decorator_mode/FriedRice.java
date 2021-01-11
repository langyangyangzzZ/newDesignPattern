package demo.ht.com.design_pattern.decorator_mode;

/**
 * @ClassName FriedRice
 * 作者: szj
 * 时间: 2021/1/9 16:57
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 炒饭类
 */
public class FriedRice extends Food {

    public FriedRice() {
        setName("炒饭");
        setPrice(12);
    }

    @Override
    public float totalPrice() {
        //调用父类的价格方法 将set的值获取出来
        return getPrice();
    }
}
