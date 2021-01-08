package demo.ht.com.design_pattern.proto_type.demo01;

import android.util.Log;

import androidx.annotation.NonNull;

/**
 * @ClassName ProtoType1
 * 作者: szj
 * 时间: 2021/1/7 17:32
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 原型模式
 */
public class Sheep implements Cloneable {
    String name;//羊的名字
    int age;//样的年龄
    String color;//羊的颜色
    public LazinessSheep lazinessSheep;//羊的朋友(懒洋洋)

    public Sheep(String name, int age, String color, LazinessSheep lazinessSheep) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.lazinessSheep = lazinessSheep;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public LazinessSheep getLazinessSheep() {
        return lazinessSheep;
    }*/

    public void setLazinessSheep(LazinessSheep lazinessSheep) {
        this.lazinessSheep = lazinessSheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", lazinessSheep=" + lazinessSheep +
                '}';
    }

    @NonNull
    @Override
    public Object clone() {
        try {
            //引用对象拷贝 将对象的方法拷贝给当前的值
            Sheep sheep = (Sheep) super.clone();
            lazinessSheep = (LazinessSheep) sheep.lazinessSheep.clone();
            return sheep;
        } catch (Exception e) {
            Log.i("原型模式:", e.getMessage());
            return null;
        }
    }
}
