package demo.ht.com.design_pattern.composite_mode;

import android.util.Log;

/**
 * @ClassName Student
 * 作者: szj
 * 时间: 2021/1/11 14:29
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 组合模式 学生类
 */
public class Student extends School {

    public Student(String name, String grade) {
        super(name, grade);
    }

    @Override
    void print() {
        Log.i("组合模式", "========== " + getName() + getGrade() + " ==========");
    }
}
