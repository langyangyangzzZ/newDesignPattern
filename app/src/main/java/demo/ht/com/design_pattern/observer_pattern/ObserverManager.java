package demo.ht.com.design_pattern.observer_pattern;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName ObserverManager
 * 时间: 2021/1/21 13:27
 *
 * 观察者模式
 */
public class ObserverManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        //观察者
        SubjectImpl subject = new SubjectImpl();

        //被观察者
        MilkObserverImpl milkObserver = new MilkObserverImpl("牛奶");
        RedBullObserverImpl redBullObserver = new RedBullObserverImpl("红牛");

        //注册牛奶观察者
        subject.registerObserver(milkObserver);

        //注册红牛观察者
        subject.registerObserver(redBullObserver);

        //移除红牛观察者
        subject.removeObserver(redBullObserver);

        //刷新 (输出结果)
        subject.notfiyObservers();
        /**
         * 角色分析:
         *  Subject: 抽象主题  :抽象主题提供一个接口，可以增加和删除观察者对象。
         *  SubjectImpl: 抽象主题实现    :将有关状态存入具体观察者对象；在具体主题内部状态改变时，给所有登记过的观察者发出通知。
         *  Observer:抽象观察者      :为所有的具体观察者定义一个接口，在得到主题通知时更新自己。
         *  MilkObserverImpl / RedBullObserver :抽象观察者实现  : 实现抽象观察者角色所要求的更新接口
         *
         * Observer是观察者  Subject是被观察者 被观察对象将观察者存放在一个容器（Container）里。
         *
         * 优点:
         *      观察者模式解除了主题和具体观察者的耦合，让耦合的双方都依赖于抽象，而不是依赖具体。
                遵守了OCP(开闭)原则
         */

    }
}
