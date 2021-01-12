package demo.ht.com.design_pattern.flyweight_mode;

import java.util.HashMap;

/**
 * @ClassName ShapeFactory
 * 作者: szj
 * 时间: 2021/1/12 14:24
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class ShapeFactory {

    HashMap<String,ShapeImpl> hashMap = new HashMap<>();

    public IShape getShape(String type){
        if (!hashMap.containsKey(type)) {
                hashMap.put(type,new ShapeImpl(type));
       }
        return hashMap.get(type);
    }

    public int getShapeSize(){
        return hashMap.size();
    }
}
