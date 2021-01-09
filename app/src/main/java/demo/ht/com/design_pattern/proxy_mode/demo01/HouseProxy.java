package demo.ht.com.design_pattern.proxy_mode.demo01;

import android.util.Log;

/**
 * @ClassName HouseProxy
 * 作者: szj
 * 时间: 2021/1/9 11:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 中介(房屋代理)
 */
public class HouseProxy {

    IHouse house;
    public HouseProxy( IHouse house) {
        this.house = house;
    }

    public void showHouse(){
        money();//收取消费
        house.showHouse();//房东的房子
        seeHouse();//带用户看房
    }

    public void money(){
        Log.i("代理模式:","我是中介,我要收取消费");
    }

    public void seeHouse(){
        Log.i("代理模式:","我是中介,我带用户看房");
    }
}
