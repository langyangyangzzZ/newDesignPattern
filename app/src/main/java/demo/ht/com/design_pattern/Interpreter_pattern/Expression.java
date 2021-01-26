package demo.ht.com.design_pattern.Interpreter_pattern;

import java.util.HashMap;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Expression
 * 时间: 2021/1/25 15:51
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public abstract class Expression {

    /**
     *
     * @param var key: a,b,c  |  value: 1,2,3...
     * @return
     */
    public abstract int interpreter(HashMap<String,Integer> var);
}
