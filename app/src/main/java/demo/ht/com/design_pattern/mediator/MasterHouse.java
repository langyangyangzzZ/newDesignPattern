package demo.ht.com.design_pattern.mediator;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName FloorHouse
 * 时间: 2021/1/23 11:26
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 中介者模式 房东 实现房屋接口
 */
public class MasterHouse extends House{

    private String msg = "";

    public MasterHouse(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendInfo(String info) {
        this.msg = info;
        mediator.registerMasterHouse(this);
    }

    @Override
    protected String getInfo() {
        return msg;
    }
}
