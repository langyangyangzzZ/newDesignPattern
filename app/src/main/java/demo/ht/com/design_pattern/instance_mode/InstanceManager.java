package demo.ht.com.design_pattern.instance_mode;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName InstanceManager
 * 作者: szj
 * 时间: 2021/1/6 17:13
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 单例模式
 */
public class InstanceManager implements DesignPattern {
    @Override
    public void showDesignPattern() {



        ////////////////////////////单利模式 之 恶汉 \\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*
         * 优点:代码简单,在类转载的时候完成实例化,避免了线程同步
         * 缺点:因为在类加载的时候创建,所以没有达到懒加载效果,如果没有用当前实例,可能造成内存浪费
         */
        InstanceMode01 instanceMode1 = InstanceMode01.getInstance();
        InstanceMode01 instanceMode01 = InstanceMode01.getInstance();
        Log.i("单利模式之饿汉静态方法01:",
                instanceMode1.hashCode() + "\t" + instanceMode01.hashCode());

        /*
         * 优缺点和上边一样
         */
        InstanceMode02 instanceMode2 = InstanceMode02.getInstance();
        InstanceMode02 instanceMode02 = InstanceMode02.getInstance();
        Log.i("单利模式之饿汉静态代码块02:",
                instanceMode2.hashCode() + "\t" + instanceMode02.hashCode());

        ////////////////////////////单利模式 之 懒汉 \\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*
         *  优点:  起到了懒加载作用,没有浪费只能在单线程使用!
         *  缺点:   线程不安全,多线程不可以使用,当在多线程情况下
         *          假设线程A走到if(instance == null) 线程B也走到 if(instance == null)
         *          两个线程会同时走instance = new InstanceMode03();
         *          会创建2个实例,违背了单例模式的原则,所以在多线程的情况下不建议使用!
                 public static InstanceMode03 getInstance(){
                        if (instance == null) {
                            instance = new InstanceMode03();
                        }
                        return instance;
                    }
         *
         */
        InstanceMode03 instanceMode3 = InstanceMode03.getInstance();
        InstanceMode03 instanceMode03 = InstanceMode03.getInstance();
        Log.i("单利模式之懒汉线程不安全03:",
                instanceMode3.hashCode() + "\t" + instanceMode03.hashCode());


        /*
         *  优点:解决线程安全问题
         *  缺点:效率太低
         *      假设我现在要执行100次getInstance()
         *      那么这100次都要进行线程同步,而不是直接返回实例对象
         *       我想要的结果是,如果现在已经存在实例,那么直接return给我实例对象即可
         */
        InstanceMode04 instanceMode4 = InstanceMode04.getInstance();
        InstanceMode04 instanceMode04 = InstanceMode04.getInstance();
        Log.i("单利模式之懒汉线程线程安全同步代码04:",
                instanceMode4.hashCode() + "\t" + instanceMode04.hashCode());

        /*
         * 问题缺陷和 InstanceMode03()懒汉式线程不安全  一样
         * 没有解决线程问题,虽然加了代码块
         * 在多线程的情况下,同时获取2个getInstance()时就会创建2个实例
         */
        InstanceMode05 instanceMode5 = InstanceMode05.getInstance();
        InstanceMode05 instanceMode05 = InstanceMode05.getInstance();
        Log.i("单利模式之懒汉线程线程不安全同步代码块05:",
                instanceMode5.hashCode() + "\t" + instanceMode05.hashCode());


        ////////////////////////////单利模式 双重校验 (推荐使用) \\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*
         *          推荐使用
         */
        InstanceMode06 instanceMode6 = InstanceMode06.getInstance();
        InstanceMode06 instanceMode06 = InstanceMode06.getInstance();
        Log.i("单利模式之双重校验(推荐使用):",
                instanceMode6.hashCode() + "\t" + instanceMode06.hashCode());

        ////////////////////////////静态内部类实现  \\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*
         * 优点:在类转载时不会直接创建,保证了懒加载
         * 类的静态属性只会在类加载时初始化
         *  因为使用内部类,在类的初始化时,线程无法进入,保证了线程的安全(JVM机制)
         */
        InstanceMode07 instanceMode7 = InstanceMode07.getInstance();
        InstanceMode07 instanceMode07 = InstanceMode07.getInstance();
        Log.i("单利模式之静态内部类使用(推荐使用):",
                instanceMode7.hashCode() + "\t" + instanceMode07.hashCode());

        ////////////////////////////单例模式之枚举实现 \\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*
         *  借助jdk1.5实现的单例模式,不仅能避免多线程问题,还能防止反序列化,重新创建对象等问题
         *   <<Effective java>>作者josh Bloch 提倡方式
         */
        InstanceMode08 instanceMode8 = InstanceMode08.INSTANCE;
        InstanceMode08 instanceMode08 = InstanceMode08.INSTANCE;
        Log.i("单利模式之枚举使用(推荐使用):",
                instanceMode8.hashCode() + "\t" +
                        instanceMode08.hashCode() + "\t" +
                        instanceMode8.showEnum());
    }
}
