package demo.ht.com.design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName OutPutObserver
 * 时间: 2021/1/21 13:41
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class SubjectImpl implements Subject{
    List<Observer> list = new ArrayList<>();


    @Override
    public void removeObserver(Observer observer) {
        //判断是否有当前状态
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void notfiyObservers() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update();
        }
    }
}