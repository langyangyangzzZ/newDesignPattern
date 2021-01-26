package demo.ht.com.design_pattern.state_pattern;

import android.util.Log;

import java.util.Random;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName CanRaffleState
 * 时间: 2021/1/26 14:41
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 状态模式 开始抽奖
 */
public class CanRaffleState implements State{
    private StateActivity activity;
    private Random random;

    public CanRaffleState(StateActivity activity) {
        this.activity = activity;
    }

    @Override//扣积分(当前是抽奖状态,不能扣积分)
    public void deduceMoney() {
        Log.i("状态模式","开始抽奖~");
        activity.setState(this);
    }

    /**
     *
     * @return true抽中
     */
    @Override
    public boolean raffle() {
        //使用随机数 10/1 的几率中奖
        random = new Random();
        int anInt = random.nextInt(10);
        if (anInt == 0) {
            Log.i("状态模式","恭喜您抽中了~");
            //中奖 将状态改为发送奖品
            activity.setState(activity.getDispenseState());
            return true;
        }  else{
            Log.i("状态模式","很遗憾,没有中奖~");
            //为中奖 将状态改为扣除积分来抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override//发送奖品(当前是抽奖状态,不能发送奖品)
    public void dispensePrize() {
        Log.i("状态模式","不能发放奖品");
    }
}
