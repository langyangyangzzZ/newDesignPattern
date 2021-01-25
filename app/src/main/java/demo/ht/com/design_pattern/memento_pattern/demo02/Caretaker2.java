package demo.ht.com.design_pattern.memento_pattern.demo02;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Caretaker
 * 时间: 2021/1/25 11:12
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 备忘录模式 备忘录
 */
public class Caretaker2 {

    //保存Memento2状态
    private Memento2 memento2;


    public Memento2 getMemento2() {
        return memento2;
    }

    public void setMemento2(Memento2 memento2) {
        this.memento2 = memento2;
    }
}
