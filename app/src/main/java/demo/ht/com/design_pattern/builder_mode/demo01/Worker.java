package demo.ht.com.design_pattern.builder_mode.demo01;

import android.util.Log;

/**
 * @ClassName Worker
 * 作者: szj
 * 时间: 2021/1/8 11:10
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 建造者模式 工人 工人完成具体工作交给指挥 指挥在交给总指挥
 */
public class Worker extends Builder {


    private final House house;

    public Worker() {
        house = new House();
    }

    @Override
    void createA() {
        house.A = "打陨石地基";
        Log.i("指挥者模式:","打陨石地基");
    }

    @Override
    void createB() {
        house.B = "黄金混凝土";
        Log.i("指挥者模式:","黄金混凝土");
    }

    @Override
    void createC() {
        house.C = "铺钻石地砖";
        Log.i("指挥者模式:","铺钻石地砖");
    }

    @Override
    void createD() {
        house.D = "美金粉刷";
        Log.i("指挥者模式:","美金粉刷");
    }

    @Override//返回具体产品
    House getHouse() {
        return house;
    }
}
