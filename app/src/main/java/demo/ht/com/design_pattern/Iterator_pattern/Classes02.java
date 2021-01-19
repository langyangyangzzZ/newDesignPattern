package demo.ht.com.design_pattern.Iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Classes01
 * 作者: szj
 * 时间: 2021/1/19 10:58
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 迭代器模式 二年级
 */
public class Classes02 implements Classes {

   List<Group> mlist  =  new ArrayList<Group>();
    /**
     * 数组下标
     */
    int index = 0;

    public Classes02() {
        printGroup("干饭人组");
        printGroup("Giao组");
        printGroup("神枪手组");
        printGroup("重案八组");
    }

    @Override
    public String showClasses() {
        return "二年级";
    }

    /**
     * @param name 学生姓名
     */
    @Override
    public void printGroup(String name) {
        mlist.add(new Group(name));
    }

    @Override
    public Iterator createIterator() {
        return new Group02terator(mlist);
    }
}
