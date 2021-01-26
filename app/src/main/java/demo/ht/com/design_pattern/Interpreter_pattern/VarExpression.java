package demo.ht.com.design_pattern.Interpreter_pattern;

import android.util.Log;

import java.util.HashMap;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName VarExpression
 * 时间: 2021/1/25 15:51
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 解释器模式 终结表达式(没有子类)
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String _key){
        this .key = _key;
        Log.i("解释器设计模式var:",_key+"");
    }
    //从map中取之
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        Log.i("解释器设计模式aaa:",var.get( this.key)+"");
        return var.get( this.key);
    }
}