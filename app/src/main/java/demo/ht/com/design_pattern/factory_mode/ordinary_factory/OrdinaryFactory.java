package demo.ht.com.design_pattern.factory_mode.ordinary_factory;

/**
 * @ClassName OrdinaryFactory
 * 作者: szj
 * 时间: 2021/1/7 9:58
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *   简单工厂类
 */
public class OrdinaryFactory {
    /**
     *
     * @param carName 要购买的车
     */
    //简单工厂实现
    public static OrdinaryCar OrdinaryCar(String carName){
        if ( carName.equals("WuLing")) {
            //返回五菱
            return  new OrdinaryWuLin();
        }else if(carName.equals("DaZhong")){
            //返回大众
            return new OrdinaryDaZhong();
        }else {
            return null;
        }
    }
}
