package demo.ht.com.design_pattern.decorator_mode;

import android.util.Log;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName DecoratorManager
 * 作者: szj
 * 时间: 2021/1/9 16:49
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 装饰器模式
 */
public class DecoratorManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

//        //面条
//        Noodles noodles = new Noodles();
//        Log.i("装饰器模式", noodles.getName() + "\t" + noodles.getPrice() + "\t总价:" + noodles.totalPrice());
//
////        炒饭
//        FriedRice friedRice = new FriedRice();
//        Log.i("装饰器模式", friedRice.getName() + "\t" + friedRice.getPrice() + "\t总价:" + friedRice.totalPrice());

        Noodles nd = new Noodles();
        Log.i("装饰器模式", nd.getName() + "\t" + nd.getPrice() + "\t总价:" + nd.totalPrice());

        Egg egg = new Egg(nd);
        Log.i("装饰器模式", egg.getName() + "\t" + egg.getPrice() + "\t总价:" + egg.totalPrice());

        Egg egg1 = new Egg(egg);
        Log.i("装饰器模式", egg1.getName() + "\t" + egg1.getPrice() + "\t总价:" + egg1.totalPrice());

        Bacon bacon = new Bacon(egg1);
        Log.i("装饰器模式", bacon.getName() + "\t" + bacon.getPrice() + "\t总价:" + bacon.totalPrice());


    }
}
