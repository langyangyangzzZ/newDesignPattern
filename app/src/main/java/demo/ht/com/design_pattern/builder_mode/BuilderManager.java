package demo.ht.com.design_pattern.builder_mode;

import android.util.Log;

import demo.ht.com.design_pattern.builder_mode.demo01.House;
import demo.ht.com.design_pattern.builder_mode.demo01.TotalCommand;
import demo.ht.com.design_pattern.builder_mode.demo01.Worker;
import demo.ht.com.design_pattern.builder_mode.demo02.Maker;
import demo.ht.com.design_pattern.builder_mode.demo02.Product;
import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName BuilderManager
 * 作者: szj
 * 时间: 2021/1/8 11:07
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 建造者模式
 */
public class BuilderManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        /**
         * 建造者模式定义:
         *      将一个复杂的对象与他的细节(实现代码)分离,使得同样的创建过程可以表示不同的样式.
         *
         * 主要作用:
         *      用户在不知道细节的情况下可以使用复杂的功能
         */

        //////////////// 方式一 \\\\\\\\\\\\\\\\\\\\\\\\
        /**
         * 产品细节不可见(实现代码与调用代码分离)
         * 满足开闭原则
         * 无法改变产品状态,所以导致灵活度不高
         * 适合固定产品
         */
        //总指挥
        TotalCommand totalCommand = new TotalCommand();

        //指挥工人创建房子 返回房子(产品)实例
        House house = totalCommand.build(new Worker());
        /*  TotalCommand   总指挥
         *  Worker     工人
         *  House     房子/产品
         *  Builder    具体实现流程
         */


        //////////////// 方式二 \\\\\\\\\\\\\\\\\\\\\\\\
        /**
         * 产品细节不可见(实现代码与调用代码分离)
         * 满足开闭原则
         * 适合一个具有多种'零件'的产品
         * 灵活度极高
         */

        //制造者
        Maker maker = new Maker();

        //制造者创建产品
        Product product =
                maker.createA("黄金汉堡").
                createB("牛杯薯条").
                createC("长生不老可乐").
                createD("凤凰鸡翅").
                buildProduct();

        Log.i("建造者模式:", "product :" + product.toString());

        /*
         * Maker      制造者
         * Product   具体产品
         * Builder2  实现流程
         */

    }
}
