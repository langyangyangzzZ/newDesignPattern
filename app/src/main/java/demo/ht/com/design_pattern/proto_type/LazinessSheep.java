package demo.ht.com.design_pattern.proto_type;

import androidx.annotation.NonNull;

/**
 * @ClassName LazinessSheep
 * 作者: szj
 * 时间: 2021/1/7 17:35
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class LazinessSheep implements Cloneable{
    String name = "懒洋洋";
    int age = 2;

    public LazinessSheep() {
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LazinessSheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
