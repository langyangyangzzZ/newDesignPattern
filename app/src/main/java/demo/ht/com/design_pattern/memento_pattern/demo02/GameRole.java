package demo.ht.com.design_pattern.memento_pattern.demo02;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName GameRole
 * 时间: 2021/1/25 11:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 备忘录模式  游戏角色(需要保存状态的类)
 */
public class GameRole {
    //攻击力
    private int aggressivity;

    //防御力
    private int defensive_power;

    //保存当前状态
    public Memento2 saveState(){
        return new  Memento2(aggressivity,defensive_power);
    }

    //恢复当前状态
    public void recoveryState(Memento2 memento2){
        this.aggressivity = memento2.getAggressivity();
        this.defensive_power = memento2.getDefensive_power();
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
