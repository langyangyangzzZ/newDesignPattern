package demo.ht.com.design_pattern.state_pattern;

import android.app.Activity;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName StateActivity
 * 时间: 2021/1/26 14:43
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class StateActivity {


    //不能抽奖
    private final State noRaffleState;
    //可以抽奖
    private final State canRaffleState;
    //中奖
    private final State dispenseState;
    //已中奖 奖品已发完
    private final State dispenseOutState;

    //当前状态
    public State state = null;
    //奖品数量
    public int number;
    //积分
    public int integral;

    /**
     * @param number 奖品数量
     * @param integral 积分
     */
    public StateActivity(int number, int integral) {
        noRaffleState = new NoRaffleState(this);
        canRaffleState = new CanRaffleState(this);
        dispenseState = new DispenseState(this);
        dispenseOutState = new DispenseOutState(this);
        this.number = number;
        this.integral = integral;
        //默认为不能抽奖
        state = getNoRaffleState();
    }

    /**
     * 开始抽奖
     */
    public void startLottery() {
        state.deduceMoney();

        //判断奖品是否抽中 奖品抽中
        if (state.raffle()) {
            //发放奖品
            state.dispensePrize();
        }
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
