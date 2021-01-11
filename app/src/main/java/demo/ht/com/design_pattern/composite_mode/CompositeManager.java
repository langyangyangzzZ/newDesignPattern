package demo.ht.com.design_pattern.composite_mode;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName CompositeManager
 * 作者: szj
 * 时间: 2021/1/11 14:13
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 组合模式
 */
public class CompositeManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        Log.i("组合模式,","=======  振华中学  ======");

        Teacher t1 = new Teacher("语文老师","一年级");
        Teacher t2 = new Teacher("数学老师","二年级");
        Teacher t3 = new Teacher("英语老师","三年级");
        Teacher t4 = new Teacher("体育老师","四年级");

        t1.add(new Student("小王","一年级"));
        t1.add(new Student("小张","一年级"));
        t1.add(new Student("小李","一年级"));

        t2.add(new Student("小王","二年级"));
        t2.add(new Student("小张","二年级"));
        t2.add(new Student("小李","二年级"));


        Instructor instructor1 = new Instructor("王教导主任", "");
        instructor1.add(t1);
        instructor1.add(t2);

        Instructor instructor2 = new Instructor("张教导主任", "");
        instructor2.add(t3);
        instructor2.add(t4);

        instructor1.print();
        instructor2.print();


    }
}
