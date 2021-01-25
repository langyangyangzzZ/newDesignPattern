package demo.ht.com.design_pattern.memento_pattern;

import android.util.Log;

import demo.ht.com.design_pattern.memento_pattern.demo01.Caretaker;
import demo.ht.com.design_pattern.memento_pattern.demo01.Originator;
import demo.ht.com.design_pattern.memento_pattern.demo02.Caretaker2;
import demo.ht.com.design_pattern.memento_pattern.demo02.GameRole;
import demo.ht.com.design_pattern.memento_pattern.demo02.Memento2;
import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName MementoManager
 * 时间: 2021/1/25 10:10
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 备忘录模式
 * <p>
 * 在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 */
public class MementoManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        ////////////  经典案例一 \\\\\\\\\\\\\\\\\\\\\\\
        /**
         * 优点: 会保存所有状态,所有状态都可以恢复
         *
         * 缺点: 会保存所有状态,每保存一次状态都会创建一个新的对象
         *       对象过多的情况下,也会分不清要恢复内个状态
         */
        //备忘录管理器
        Caretaker caretaker = new Caretaker();

        //需要保存状态
        Originator originator = new Originator();

        originator.setInfo("100");

        //保存状态 并添加到备忘录管理器中
        caretaker.add(originator.saveState());
        Log.i("备忘录模式", "当前状态 :" + originator.getInfo());


        originator.setInfo("80");
        //保存状态 并添加到备忘录管理器中
        caretaker.add(originator.saveState());
        Log.i("备忘录模式", "当前状态 :" + originator.getInfo());


        originator.setInfo("30");
        //保存状态 并添加到备忘录管理器中
        caretaker.add(originator.saveState());
        Log.i("备忘录模式", "当前状态 :" + originator.getInfo());

        //恢复当前状态
        originator.RecoveryStatus(caretaker.getMemento(1));
        Log.i("备忘录模式", "当前状态 :+" + originator.getInfo());


        ////////////////// 经典案例二  \\\\\\\\\\\\\\\\\\\\\\\\\\\
        /**
         * 优点: 保存一次对象
         */
        GameRole gameRole = new GameRole();
        //默认攻击力
        gameRole.setAggressivity(100);
        //默认防御力
        gameRole.setDefensive_power(100);

        Log.i("备忘录模式2",
                "当前状态 :攻击力: " + gameRole.getAggressivity() +
                        " 防御力:" + gameRole.getDefensive_power());

        //备忘录
        Caretaker2 caretaker2 = new Caretaker2();

        //保存状态
        caretaker2.setMemento2(gameRole.saveState());

        //大战后攻击力和防御力降低到50
        gameRole.setAggressivity(50);
        gameRole.setDefensive_power(50);

        Log.i("备忘录模式2",
                "当前状态 :攻击力: " + gameRole.getAggressivity() +
                        " 防御力:" + gameRole.getDefensive_power());


        //恢复状态
        gameRole.recoveryState(caretaker2.getMemento2());


        Log.i("备忘录模式2",
                "当前状态 :攻击力: " + gameRole.getAggressivity() +
                        " 防御力:" + gameRole.getDefensive_power());

    }
}
