package demo.ht.com.design_pattern.visitor_pattern;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @ClassName Visitor
 * 作者: szj
 * 时间: 2021/1/17
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 *  访问者模式管理器
 */
public class VisitorManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        //小明
        XiaoMing xiaoMing = new XiaoMing();
        //小红
        XiaoHong xiaoHong = new XiaoHong();
        //小张
        XiaoZhang xiaoZhang = new XiaoZhang();


        //小明语文成绩
        Chinese chinese1 = new Chinese("小明",67);

        //小红语文成绩
        Chinese chinese2 = new Chinese("小红",100);

        //小明数学成绩
        Mathematics mathematics = new Mathematics("小明",43);

        English english = new English("小张", 55);

        //结构对象角色
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.outputAchievement(xiaoMing,chinese1);
        objectStructure.outputAchievement(xiaoHong,chinese2);
        objectStructure.outputAchievement(xiaoMing,mathematics);
//        objectStructure.outputAchievement(xiaoZhang,english);

    }
}
