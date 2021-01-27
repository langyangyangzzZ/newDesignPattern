package demo.ht.com.design_pattern.Interpreter_pattern;

import android.util.Log;

import java.util.HashMap;
import java.util.Stack;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName InterpreterManager
 * 时间: 2021/1/25 14:28
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 解释器模式
 */
public class InterpreterManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        ///////////////// Stack(栈)简单使用 \\\\\\\\\\\\\\\\\\\\\\
            Stack<Object> stack = new Stack<>();
            //是否为null
            boolean empty = stack.empty();

            Log.i("Stack", "栈是否为null: " + empty);

            //入栈 添加一个元素
            stack.push("A");
            stack.push("B");
            stack.push("C");
            stack.push("D");
            stack.push("E");

        Log.i("Stack", stack.toString());


        //取出数组末尾的元素，然后将该元素从数组中删除。
        Log.i("Stackpop",  stack.pop().toString());

        /**
         * 如果没有,返回 -1
         */
        Log.i("Stack", "元素在栈内的位置 : " + stack.search("D"));
        Log.i("Stack", "栈底元素 : " + stack.peek());

        ////////////  解释器模式 经典案例   \\\\\\\\\\\\\\\\\\\\\\\
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",23);
        map.put("b",12);

        Calculator cal = new Calculator("a+b");

        System.out.println( "运算结果为：" + cal.run(map));
    }
}
