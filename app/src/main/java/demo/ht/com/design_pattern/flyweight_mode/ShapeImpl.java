package demo.ht.com.design_pattern.flyweight_mode;

import android.util.Log;

/**
 * @ClassName ShapeImpl
 * 作者: szj
 * 时间: 2021/1/12 14:23
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class ShapeImpl  implements IShape{

    //共享部分 (形状)
    private String type = "";

    public ShapeImpl(String type) {
        this.type = type;
    }

    @Override//外部享元角色
    public void showShape(Color color) {
        Log.i("享元模式","绘制 "+type+" 成功 颜色为:"+color.getColor());
    }
}
