package demo.ht.com.design_pattern.state_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName NoRaffleState
 * 时间: 2021/1/26 14:41
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 状态模式 扣除积分抽奖类 积分不足不能抽奖
 */
public class NoRaffleState implements State {
    private StateActivity activity;

    public NoRaffleState(StateActivity activity) {
        this.activity = activity;
    }

    //扣除积分
    @Override
    public void deduceMoney() {
        //积分>10才可以抽奖

        Log.i("状态模式", "当前积分为:"+activity.integral );
        if (activity.integral >= 10) {
            //每抽一次奖 扣10积分
            activity.integral -= 10;

            Log.i("状态模式", "已扣除积分,可以抽奖");

            //扣除了积分 将状态修改为开始抽奖模式
            activity.setState(activity.getCanRaffleState());
        }else{
            Log.i("状态模式", "积分不足");
        }
    }

    //抽奖
    @Override
    public boolean raffle() {
        Log.i("状态模式", "扣除积分在抽奖哦!");
        return false;
    }

    //发奖品
    @Override
    public void dispensePrize() {
        Log.i("状态模式", "无法发送奖品");
    }
}
