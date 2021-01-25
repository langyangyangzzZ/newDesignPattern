package demo.ht.com.design_pattern.memento_pattern.demo01;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Originator
 * 时间: 2021/1/25 10:12
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 备忘录模式 需要保存状态类
 */
public class Originator {

    String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    /**
     *  保存状态
     * @return 当前状态用一个类来保存
     */
    public Memento saveState(){
        return new Memento(info);
    }

    /**
     *  恢复状态
     * @return 当前状态
     */
    public void RecoveryStatus(Memento memento){
        info = memento.info;
    }

}
