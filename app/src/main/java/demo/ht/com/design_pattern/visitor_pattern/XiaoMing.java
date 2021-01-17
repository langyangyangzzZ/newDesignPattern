package demo.ht.com.design_pattern.visitor_pattern;


/**
 * @ClassName XiaoMing
 * 作者: szj
 * 时间: 2021/1/17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 访问者模式 小明
 */
public class XiaoMing implements Student {


    @Override
    public void student(Achievement achievement) {
        //小明成绩
        achievement.fraction();
    }
}
