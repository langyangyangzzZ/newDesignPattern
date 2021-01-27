package demo.ht.com.design_pattern.chain_of_responsibility;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName MaterialScience
 * 时间: 2021/1/27 14:41
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 责任链模式 材料类
 */
public class MaterialScience {
    //材料价格
    private int price;

    public MaterialScience(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
