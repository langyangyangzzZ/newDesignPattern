package demo.ht.com.design_pattern.Iterator_pattern;

import java.util.Iterator;

/**
 * @ClassName Classes01
 * 作者: szj
 * 时间: 2021/1/19 10:58
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 迭代器模式 一年级
 */
public class Classes01 implements Classes {

    Group[] groups;
    /**
     * 数组下标
     */
    int index = 0;

    public Classes01() {
        groups = new Group[5];
        printGroup("雄鹰组");
        printGroup("卧龙组");
        printGroup("凤雏组");
        printGroup("神龟组");
    }

    @Override
    public String showClasses() {
        return "一年级";
    }

    /**
     * @param name 学生姓名
     */
    @Override
    public void printGroup(String name) {
        groups[index++] = new Group(name);
    }

    @Override
    public Iterator createIterator() {
        return new Group01terator(groups);
    }
}
