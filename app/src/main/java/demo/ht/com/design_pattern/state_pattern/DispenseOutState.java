package demo.ht.com.design_pattern.state_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName DispenseOutState
 * 时间: 2021/1/26 14:42
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 状态模式 奖品发完状态
 */
public class DispenseOutState implements State {

    private StateActivity activity;

    public DispenseOutState(StateActivity activity) {
        this.activity = activity;
    }

    @Override//当前是奖品发完状态 不能扣积分
    public void deduceMoney() {
        Log.i("状态模式", "奖品已经全部发完");
    }

    @Override//当前是奖品发完状态 不能抽奖
    public boolean raffle() {
        Log.i("状态模式", "奖品已经全部发完");
        return false;
    }

    @Override//当前是奖品发完状态 奖品发送完毕
    public void dispensePrize() {
        Log.i("状态模式", "奖品已经全部发完");
    }
}
