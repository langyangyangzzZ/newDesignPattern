package demo.ht.com.design_pattern.memento_pattern.demo01;

import java.util.ArrayList;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Caretaker
 * 时间: 2021/1/25 10:17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 备忘录模式 备忘录
 */
public class Caretaker {
    /**
     * 以List的方式保存状态
     */
    ArrayList<Memento> list = new ArrayList<>();

    //添加状态
    public void add(Memento memento){
        list.add(memento);
    }

    //获取状态
    public Memento getMemento(int index){
        return list.get(index);
    }

}
