package demo.ht.com.design_pattern.Interpreter_pattern;

import java.util.HashMap;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName SubExpression
 * 时间: 2021/1/25 16:08
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 解释器模式 减法表达式
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression _left,Expression _right){
        super (_left,_right);
    }
    //左右两个表达式相减
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super .left.interpreter(var) - super .right.interpreter(var);
    }
}