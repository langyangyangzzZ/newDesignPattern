package demo.ht.com.design_pattern.adapter_mode;

/**
 * @ClassName Computer
 * 作者: szj
 * 时间: 2021/1/8 15:18
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 适配器模式 电脑
 */
public class Computer {

    //电脑需要转接线才能上网
    public void net(Adapter adapter){
        adapter.net();
    }
}
