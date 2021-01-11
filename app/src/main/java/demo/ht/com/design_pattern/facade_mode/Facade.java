package demo.ht.com.design_pattern.facade_mode;

/**
 * @ClassName Facade
 * 作者: szj
 * 时间: 2021/1/11 17:15
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 外观模式 缓冲层
 */
public class Facade {

    //空调
    private final AirConditioner airConditioner;
    //电脑
    private final Computer computer;
    //电视
    private final Television television;
    //手机
    private final Phone phone;

    public Facade() {
        airConditioner = AirConditioner.getInstance();
        computer = Computer.getInstance();
        television = Television.getInstance();
        phone = Phone.getInstance();
    }

    //打开 空调 电脑 电视 手机
    public void open() {
        airConditioner.open();
        computer.open();
        television.open();
        phone.open();
    }

    //连接手机WIFI
    public void connectWiFi() {
        phone.connectWiFi();
    }

    public void close(){
        airConditioner.close();
        computer.close();
        television.close();
        phone.close();
    }
}
