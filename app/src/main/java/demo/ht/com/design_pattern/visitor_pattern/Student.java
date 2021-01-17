package demo.ht.com.design_pattern.visitor_pattern;

/**
 * @ClassName Student
 * 作者: szj
 * 时间: 2021/1/17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 访问者模式 学生接口
 */
public interface Student {
    //具体学生
    void student(Achievement achievement);
}
