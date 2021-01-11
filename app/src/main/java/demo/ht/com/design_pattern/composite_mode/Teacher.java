package demo.ht.com.design_pattern.composite_mode;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Teacher
 * 作者: szj
 * 时间: 2021/1/11 14:17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 组合模式 老师类
 */
public class Teacher extends School {

    List<School> mList = new ArrayList<>();

    public Teacher(String name, String grade) {
        super(name, grade);
    }

    @Override
    void print() {
        Log.i("组合模式:", "========" + getName() +getGrade()+ "========");
        for (int i = 0; i < mList.size(); i++) {
            mList.get(i).print();
        }
    }

    @Override
    public void add(School school) {
        mList.add(school);
    }

    @Override
    public void remove(School school) {
        mList.remove(school);
    }
}
