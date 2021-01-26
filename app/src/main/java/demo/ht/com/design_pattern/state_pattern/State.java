package demo.ht.com.design_pattern.state_pattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName State
 * 时间: 2021/1/26 14:39
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public interface State {
    /**
     * 扣除10积分抽奖
     */
    public void deduceMoney();


    /**
     *抽奖
     * @return true 抽中
     */
    public boolean raffle();

    /**
     * 发奖品
     */
    public void dispensePrize();

}
