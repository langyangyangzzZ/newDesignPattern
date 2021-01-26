package demo.ht.com.design_pattern.Interpreter_pattern;

import android.util.Log;

import java.util.HashMap;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName AddExpression
 * 时间: 2021/1/25 15:52
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 解释器模式 加法表达式
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    //把左右两个表达式运算的结果加起来
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}


