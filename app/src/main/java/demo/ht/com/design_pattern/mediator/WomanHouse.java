package demo.ht.com.design_pattern.mediator;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName WomanHouse
 * 时间: 2021/1/23 15:11
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class WomanHouse extends House {
    private String msg;

    public WomanHouse(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendInfo(String info) {
        msg = info;
        mediator.registerTenantHouse(this);
    }

    @Override
    protected String getInfo() {
        return msg;
    }
}
