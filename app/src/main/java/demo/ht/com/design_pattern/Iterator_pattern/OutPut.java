package demo.ht.com.design_pattern.Iterator_pattern;

import android.util.Log;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName OutPut
 * 作者: szj
 * 时间: 2021/1/19 11:06
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 迭代器模式
 */
public class OutPut {

    List<Classes> mlist;

    public OutPut(List<Classes> mlist) {
        this.mlist = mlist;
    }

    public void printClasses() {
        Iterator<Classes> iterator = mlist.iterator();
        while (iterator.hasNext()) {
            Classes next = (Classes) iterator.next();
            Log.i("迭代器模式"," ========"+next.showClasses()+" ========");
            printGroup(next.createIterator());
        }
    }


    /**
     * 输出小组
     * @param iterator 当前实现Iterator的类
     */
    public void printGroup(Iterator iterator){
        while (iterator.hasNext()) {
            Group next = (Group) iterator.next();
            Log.i("迭代器模式", next.getName());
        }

    }
}
