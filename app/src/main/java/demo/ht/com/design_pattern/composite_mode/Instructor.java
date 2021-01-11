package demo.ht.com.design_pattern.composite_mode;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Instructor
 * 作者: szj
 * 时间: 2021/1/11 15:36
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 教导主任
 */
public class Instructor extends School {
    private List<School> mlist = new ArrayList<>();

    public Instructor(String name, String grade) {
        super(name, grade);
    }

    @Override
    public void add(School school) {
        mlist.add(school);
    }

    @Override
    public void remove(School school) {
        mlist.remove(school);
    }

    @Override
    void print() {
        Log.i("组合模式", "----- " + getName() + getGrade() + "------");
        for (int i = 0; i < mlist.size(); i++) {
            mlist.get(i).print();
        }
    }
}
