package demo.ht.com.design_pattern.Iterator_pattern;

import java.util.Iterator;

/**
 * @ClassName Classes
 * 作者: szj
 * 时间: 2021/1/19 10:58
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 迭代器模式 班级接口
 */
public interface Classes {
    /**
     * @return 当前具体班级
     */
    public String showClasses();


    /**
     * @param name 具体小组
     */
    public void printGroup(String name);

    /**
     * @return 当前迭代器
     */
    public Iterator createIterator();
}
