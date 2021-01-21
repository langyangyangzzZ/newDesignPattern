package demo.ht.com.design_pattern.observer_pattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Subject
 * 时间: 2021/1/21 13:28
 *
 * 观察则模式 被观察则
 */
public interface Subject {

    /**
     *    移除观察者
     */
    public void removeObserver(Observer observer);


    /**
     *    注册观察者
     */
    public void registerObserver(Observer observer);

    /**
     *   刷新观察者
     */
    public void notfiyObservers();

}
