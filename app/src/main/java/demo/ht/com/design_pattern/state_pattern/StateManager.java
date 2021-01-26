package demo.ht.com.design_pattern.state_pattern;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName StateManager
 * 时间: 2021/1/26 14:28
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 状态模式
 */
public class StateManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        StateActivity stateActivity = new StateActivity(2,300);


        for (int i = 0; i < 30; i++) {

            Log.i("状态模式"," ==========+第"+(i+1)+"次抽奖================");

            stateActivity.startLottery();
        }


    }
}
