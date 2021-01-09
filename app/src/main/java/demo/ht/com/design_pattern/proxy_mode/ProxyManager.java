package demo.ht.com.design_pattern.proxy_mode;

import demo.ht.com.design_pattern.proxy_mode.demo01.HouseMaster;
import demo.ht.com.design_pattern.proxy_mode.demo01.HouseProxy;
import demo.ht.com.design_pattern.proxy_mode.demo01.IHouse;
import demo.ht.com.design_pattern.proxy_mode.demo02.ProxyInvocationHandler;
import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName ProxyManager
 * 作者: szj
 * 时间: 2021/1/9 11:12
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 代理模式
 *
 */
public class ProxyManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        /////////////  静态代理 \\\\\\\\\\\\\\\\\\\\\\\
        /*
         * 优点:
         *      没有改变原有的代码,满足开闭原则(对修改关闭)
         *      公共代码交给代理类,实现了业务的分工

         * 缺点:
         *      一个类就需要创建一个代理类,代码量会翻倍,开发效率会降低
         */
        //创建代理类 传入需要代理的类
//        HouseProxy houseProxy = new HouseProxy(new HouseMaster());
//
//        houseProxy.showHouse();
        /**
         *  HouseProxy  代理类     --中介
         *  HouseMaster 真实类     --房东
         *  IHouse      需要代理的东西  --房子
         *  直接与代理类(HouseProxy)交互 ,不用修改被代理类(HouseMaster)代码
         */



        /////////////////// 动态代理 \\\\\\\\\\\\\\\\\\\\\\\
        /**
         *  优点:
         *      没有改变原有的代码,满足开闭原则(对修改关闭)
         *      公共代码交给代理类,实现了业务的分工
         *      动态代理代理的是一个接口,一般是对应的一个业务
         *      一个动态代理可以代理多个接口,只要是实现同一个接口即可,相对于静态代理每一个被代理类都需要创建一个代理类来说,更加灵活
         */
        //需要代理 真实角色
        HouseMaster houseMaster = new HouseMaster();

        //代理类生成器  传入需要代理的类
        ProxyInvocationHandler pit = new ProxyInvocationHandler(houseMaster);

        //生成代理类 (必须返回接口)
        IHouse proxy = (IHouse) pit.getProxy();

        //输出租房子
        proxy.showHouse();

        /**
         * HouseMaster 真实角色  需要代理 (房子的主人需要出租房子)
         * IHouse      接口 房子
         * ProxyInvocationHandler 代理生成器 自动生成代理类
         * pit.getProxy() 返回接口
         *  proxy.showHouse(); 租房子
         */




    }
}
