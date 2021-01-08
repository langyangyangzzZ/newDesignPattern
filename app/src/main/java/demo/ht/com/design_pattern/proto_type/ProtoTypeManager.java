package demo.ht.com.design_pattern.proto_type;

import android.util.Log;

import demo.ht.com.design_pattern.proto_type.demo01.LazinessSheep;
import demo.ht.com.design_pattern.proto_type.demo01.Sheep;
import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName ProtoTypeManager
 * 作者: szj
 * 时间: 2021/1/7 17:33
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 原型模式
 */
public class ProtoTypeManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        ///////////////////   原型模式之普通克隆  \\\\\\\\\\\\\\\\\\\\
        Sheep sp1 = new Sheep("tom", 3, "red");
        Sheep sp2 = new Sheep("tom", 3, "red");

        Log.i("原型模式普通方法:",sp1.toString()+"\t hashCode:"+sp1.hashCode());
        Log.i("原型模式普通方法:",sp2.toString()+"\t hashCode:"+sp2.hashCode());

        sp2.setName("jack");

        Log.i("原型模式普通方法:",sp1.toString()+"\t hashCode:"+sp1.hashCode());
        Log.i("原型模式普通方法:",sp2.toString()+"\t hashCode:"+sp2.hashCode());

        ///////////////////   原型模式之深克隆   \\\\\\\\\\\\\\\\\\\\
        LazinessSheep lazinessSheep = new LazinessSheep();

        Sheep sheep1 = new Sheep("tom", 3, "red",lazinessSheep);

        //'克隆羊'
        Sheep sheep2 = (Sheep) sheep1.clone();
        Log.i("原型模式:", "============  克隆之前  ===============");
        Log.i("原型模式:", "sheep1=>" + sheep1.toString() + "\t hashCode=>" + sheep1.hashCode());
        Log.i("原型模式:", "sheep2=>" + sheep2.toString() + "\t hashCode=>" + sheep2.hashCode());

        Log.i("原型模式:", "===========================");

        sheep1.lazinessSheep.setName("灰太狼");

        Log.i("原型模式:", "============  克隆之后  ===============");
        Log.i("原型模式:", "sheep1=>" + sheep1.toString() + "\t hashCode=>" + sheep1.hashCode());
        Log.i("原型模式:", "sheep2=>" + sheep2.toString() + "\t hashCode=>" + sheep2.hashCode());



    }
}
