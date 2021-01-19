package demo.ht.com.design_pattern.Iterator_pattern;

import java.util.Iterator;

/**
 * @ClassName gradeInerator
 * 作者: szj
 * 时间: 2021/1/19 10:49
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 迭代器模式 第一组
 */
public class Group01terator implements Iterator {

    /**
     * 元素数组
     */
    Group[] groups;
    /**
     * 下标
     */
    int index = 0;

    public Group01terator(Group[] groups) {
        this.groups = groups;
    }

    /**
     * 判断有无下一个元素
     *
     * @return true有下一个
     */
    @Override
    public boolean hasNext() {
        //当前下标 > 元素长度  || 当前元素为null 说明没有下一个元素
        if (index >= groups.length || groups[index] == null) {
            return false;
        } else {
            //若有下一个元素 当前下标++
            return true;
        }
    }

    /**
     *  返回当前元素
     * @return 当前数组对象
     */
    @Override
    public Object next() {
        return groups[index++];
    }
}
