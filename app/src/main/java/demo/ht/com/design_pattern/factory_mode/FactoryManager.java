package demo.ht.com.design_pattern.factory_mode;

import demo.ht.com.design_pattern.factory_mode.abstract_factory.IComputer;
import demo.ht.com.design_pattern.factory_mode.abstract_factory.IPhone;
import demo.ht.com.design_pattern.factory_mode.abstract_factory.VIVOFactory;
import demo.ht.com.design_pattern.factory_mode.abstract_factory.ViVoPhone;
import demo.ht.com.design_pattern.factory_mode.abstract_factory.XiaoMiFactory;
import demo.ht.com.design_pattern.factory_mode.factory_method.FaCar;
import demo.ht.com.design_pattern.factory_mode.factory_method.FaDaZhongFactory;
import demo.ht.com.design_pattern.factory_mode.factory_method.FaTeSiLaFactory;
import demo.ht.com.design_pattern.factory_mode.factory_method.FaWuLingFactory;
import demo.ht.com.design_pattern.factory_mode.ordinary_factory.OrdinaryCar;
import demo.ht.com.design_pattern.factory_mode.ordinary_factory.OrdinaryDaZhong;
import demo.ht.com.design_pattern.factory_mode.ordinary_factory.OrdinaryFactory;
import demo.ht.com.design_pattern.factory_mode.ordinary_factory.OrdinaryWuLin;
import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName FactoryManager
 * 作者: szj
 * 时间: 2021/1/7 9:46
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * //工厂模式
 */
public class FactoryManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        /*
         * 工厂模式实现: 创建这和调用者分离
         *工厂模式必须满足:
         *          OCP(开闭)原则(对修改关闭,对扩展开发)
         *          依赖倒置原则(面向接口编程)
         *          迪米特原则(只能和直接朋友通信)
         *
         *   工厂模式核心思想:
         *     不要使用new关键字创建实例,用工厂代替他,将调用者和实现类实现解耦
         */

        //////////////////// 惯用写法 \\\\\\\\\\\\\\\\\\\\\\\\\
        OrdinaryWuLin ordinaryWuLin = new OrdinaryWuLin();
        OrdinaryDaZhong ordinaryDaZhong = new OrdinaryDaZhong();
        ordinaryWuLin.CarName();
        ordinaryDaZhong.CarName();

        //////////////////// 普通工厂模式 \\\\\\\\\\\\\\\\\\\\\\\\\
        /*
         *  优点:简单易操作
         *
         *  缺点:     没有实现开闭原则,假设我增加一种车,特斯拉
         *          需要改变OrdinaryFactory里的内容才能够条件
         */
        OrdinaryCar ordinaryWuLin1 = OrdinaryFactory.OrdinaryCar("WuLing");
        OrdinaryCar ordinaryDaZhong1 = OrdinaryFactory.OrdinaryCar("DaZhong");
        ordinaryWuLin1.CarName();
        ordinaryDaZhong1.CarName();


        //////////////////// 工厂方法模式 \\\\\\\\\\\\\\\\\\\\\\\\\
        /*
         * 优点:满足开闭原则,扩展性高
         * 缺点:代码增加太多,因为一个Car类就需要对应一个CarFactory类
         */
        FaCar faDaZhong = new FaDaZhongFactory().createCar();
        FaCar faWuLing = new FaWuLingFactory().createCar();
        FaCar faTeSiLa = new FaTeSiLaFactory().createCar();
        faDaZhong.CarName();
        faWuLing.CarName();
        faTeSiLa.CarName();

        ////////////////////  抽象工厂方法  \\\\\\\\\\\\\\\\\\\\\\\\\
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IComputer computer = xiaoMiFactory.createComputer();
        IPhone phone = xiaoMiFactory.createPhone();
        computer.play();//小米电脑
        computer.study();//小米电脑
        computer.WatchTv();//小米电脑

        phone.open();//小米手机
        phone.sendSMS();//小米手机
        phone.wifi();//小米手机

        IPhone phone1 = new VIVOFactory().createPhone();
        phone1.wifi();
        phone1.sendSMS();

    }
}
