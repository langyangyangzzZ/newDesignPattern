package demo.ht.com.design_pattern.Interpreter_pattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName SymbolExpression
 * 时间: 2021/1/25 15:52
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 *  * 解释器模式 非终结表达式(有子类)
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    //所有的解析公式都应只关心自己左右两个表达式的结果
    public SymbolExpression(Expression _left,Expression _right){
        this.left = _left;
        this.right = _right;
    }
}