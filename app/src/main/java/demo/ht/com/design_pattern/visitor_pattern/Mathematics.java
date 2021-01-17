package demo.ht.com.design_pattern.visitor_pattern;

import android.util.Log;

/**
 * @ClassName Mathematics
 * 作者: szj
 * 时间: 2021/1/17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 访问者模式 数学成绩
 */
public class Mathematics implements  Achievement {
    //姓名
    private final String name;
    //分数
    private final double fraction;

    public Mathematics(String name ,double fraction) {
        this.fraction = fraction;
        this.name = name;
    }
    @Override
    public void fraction() {
        Log.i("访问者模式",name+" 的数学成绩为 "+fraction+" 分");
    }
}
