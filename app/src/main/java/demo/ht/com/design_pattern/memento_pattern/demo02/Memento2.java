package demo.ht.com.design_pattern.memento_pattern.demo02;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Memento2
 * 时间: 2021/1/25 11:14
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 备忘录模式 保存状态类
 */
public class Memento2 {
    //攻击力
    private int aggressivity;

    //防御力
    private int defensive_power;

    public Memento2(int aggressivity, int defensive_power) {
        this.aggressivity = aggressivity;
        this.defensive_power = defensive_power;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }

    public int getDefensive_power() {
        return defensive_power;
    }

    public void setDefensive_power(int defensive_power) {
        this.defensive_power = defensive_power;
    }
}
