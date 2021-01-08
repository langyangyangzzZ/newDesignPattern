package demo.ht.com.design_pattern.builder_mode.demo02;

/**
 * @ClassName Waiter
 * 作者: szj
 * 时间: 2021/1/8 11:28
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 建造者模式 产品
 */
public class Product {
    private   String  A;//汉堡
    private  String  B;//薯条
    private  String  C;//可乐
    private  String  D;//鸡翅

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }
}
