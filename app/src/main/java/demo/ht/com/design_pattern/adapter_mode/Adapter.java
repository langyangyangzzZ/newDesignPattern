package demo.ht.com.design_pattern.adapter_mode;

/**
 * @ClassName Adapter
 * 作者: szj
 * 时间: 2021/1/8 15:18
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 转接线
 */
public class Adapter implements INettingToComputer{

    private  Netting netting;

    public Adapter(Netting netting) {
        this.netting = netting;
    }

    @Override
    public void net() {
        netting.ConnectNetwork();
    }

}
