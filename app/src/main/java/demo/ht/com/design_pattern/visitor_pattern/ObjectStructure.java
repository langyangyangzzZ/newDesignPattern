package demo.ht.com.design_pattern.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * 作者: szj
 * 时间: 2021/1/17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 访问者模式 结构对象角色
 */
public class ObjectStructure {
    /**
     *  //输出成绩
     * @param student 具体学生
     * @param achievement 具体要除数的分数
     */
    public void outputAchievement(Student student,Achievement achievement){
            student.student(achievement);
    }
}
