package demo.ht.com.design_pattern.Iterator_pattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName IteratorManager
 * 作者: szj
 * 时间: 2021/1/19 10:47
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class IteratorManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        //////////////// 源码分析 \\\\\\\\\\\\\\\\\\\\\
        /*
        ArrayList<String> mList = new ArrayList<>();
        mList.add("张三");
        mList.add("李四");
        mList.add("王五");
        Iterator<String> iterator = mList.iterator();
        //判断有没有下一个元素
        while (iterator.hasNext()) {
            //输出当前元素
            Log.i("迭代器模式",iterator.next());
        }
        */


        ///////////////////迭代器使用 \\\\\\\\\\\\\\\\\\\\
        ArrayList<Classes> list = new ArrayList<>();

        //一年级
        list.add(new Classes01());
        //二年级
        list.add(new Classes02());

        //完成对所有年级 小组的输出
        OutPut outPut = new OutPut(list);

        //输出年级
        outPut.printClasses();




    }
}
