package demo.ht.com.design_pattern.builder_mode.demo02;

/**
 * @ClassName Maker
 * 作者: szj
 * 时间: 2021/1/8 11:27
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 制造者
 */
public class Maker extends Builder2 {

    private final Product product;

    public Maker() {
        product = new Product();
    }

    @Override
   public Builder2 createA(String msg) {
        product.setA(msg);
        return this;
    }

    @Override
    public  Builder2 createB(String msg) {
        product.setB(msg);
        return this;
    }

    @Override
    public   Builder2 createC(String msg) {
        product.setC(msg);
        return this;
    }

    @Override
    public Builder2 createD(String msg) {
        product.setD(msg);
        return this;
    }

    @Override
  public Product buildProduct() {
        return product;
    }
}
