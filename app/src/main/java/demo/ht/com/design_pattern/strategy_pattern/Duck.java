package demo.ht.com.design_pattern.strategy_pattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Duck
 * 时间: 2021/1/27 10:02
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 策略模式 鸭子抽象类
 */
public abstract class Duck {

    Fly mFly;


    /**
     * 飞翔方法
     */
    public  void flyMethod(){
        mFly.fly();
    };

    /**
     * 游泳
     */
    public abstract void swimming();

    //改变策略
    public void setmFly(Fly mFly) {
        this.mFly = mFly;
    }
}
