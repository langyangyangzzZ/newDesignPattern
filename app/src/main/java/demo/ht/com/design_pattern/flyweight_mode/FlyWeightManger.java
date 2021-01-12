package demo.ht.com.design_pattern.flyweight_mode;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName FlyWeightManger
 * 作者: szj
 * 时间: 2021/1/12 14:27
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 享元模式
 */
public class FlyWeightManger implements DesignPattern {
    @Override
    public void showDesignPattern() {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape1 = shapeFactory.getShape("正方形");
        IShape shape2 = shapeFactory.getShape("正方形");
        IShape shape3 = shapeFactory.getShape("三角形");
        IShape shape4 = shapeFactory.getShape("正方形");
        shape1.showShape(new Color("红色"));
        shape2.showShape(new Color("红色"));
        shape3.showShape(new Color("黄色"));
        shape4.showShape(new Color("黑色"));


        Log.i("享元模式","总个数为: "+shapeFactory.getShapeSize()+"");

    }
}
