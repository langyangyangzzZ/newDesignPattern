package demo.ht.com.design_pattern.factory_mode.abstract_factory;

/**
 * @ClassName IPhone
 * 作者: szj
 * 时间: 2021/1/7 11:02
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * //手机细节实现
 */
public interface IPhone {
    /**
     * 打开手机
     */
    void open();

    /**
     * 连接Wifi
     */
    void wifi();

    /**
     * 发送短信
     */
    void sendSMS();
}
