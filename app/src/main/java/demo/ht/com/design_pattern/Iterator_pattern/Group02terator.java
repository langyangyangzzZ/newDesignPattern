package demo.ht.com.design_pattern.Iterator_pattern;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName gradeInerator
 * 作者: szj
 * 时间: 2021/1/19 10:49
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Group02terator implements Iterator {

    /**
     * 元素数组
     */
    List<Group> list ;
    /**
     * 下标
     */
    int index = 0;

    public Group02terator(List<Group> list) {
        this.list = list;
    }

    /**
     * 判断有无下一个元素
     *
     * @return true有下一个
     */
    @Override
    public boolean hasNext() {
        //当前下标 > 元素长度
        if (index > list.size() - 1) {
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
        return list.get(index++);
    }
}
