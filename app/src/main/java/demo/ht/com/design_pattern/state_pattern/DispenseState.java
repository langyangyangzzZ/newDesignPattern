package demo.ht.com.design_pattern.state_pattern;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName DispenseState
 * 时间: 2021/1/26 14:41
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 状态模式 发奖品状态
 */
public class DispenseState implements State {

    private StateActivity activity;

    public DispenseState(StateActivity activity) {
        this.activity = activity;
    }

    @Override//当前是抽中奖状态 不能扣积分
    public void deduceMoney() {
        Log.i("状态模式", "正在发放奖品,不能扣积分~");
    }

    @Override//当前是抽中奖状态,不能抽奖
    public boolean raffle() {
        Log.i("状态模式", "正在发放奖品,不能抽奖~");
        return false;
    }

    @Override//当前是抽中奖状态 查看奖品个数发送奖品
    public void dispensePrize() {
        int number = activity.getNumber();

        Log.i("状态模式", "当前奖品个数为:" + number);
        //奖品总数>0说明有奖品
        if (number > 0) {
            //领取奖品后让奖品数量-1
            activity.number--;
            Log.i("状态模式", "奖品已经发放~");
            //发放完奖品后将状态改为不能发放奖品
            activity.setState(activity.getNoRaffleState());
        } else {

            Log.i("状态模式", "很遗憾,您中奖了,可是奖品发送完了~");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
