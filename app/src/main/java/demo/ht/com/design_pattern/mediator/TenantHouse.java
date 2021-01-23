package demo.ht.com.design_pattern.mediator;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Villa
 * 时间: 2021/1/23 11:27
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 中介者模式 租客 实现房屋接口
 */
public class TenantHouse extends House {
    private String msg = "";



    public TenantHouse(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendInfo(String info) {
        msg = info;
        mediator.registerTenantHouse(this);
    }

    @Override
    public String getInfo() {
        return msg;
    }
}
