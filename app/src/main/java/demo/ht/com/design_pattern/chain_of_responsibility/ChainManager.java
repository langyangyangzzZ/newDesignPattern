package demo.ht.com.design_pattern.chain_of_responsibility;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName ChainManager
 * 时间: 2021/1/27 14:37
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 责任链模式
 */
public class ChainManager implements DesignPattern {
    @Override
    public void showDesignPattern() {

        //材料
        MaterialScience materialScience = new MaterialScience(1000);

        //张主任 责任人
        DirectorApprover directorApprover = new DirectorApprover("张主任", 5000);

        //王副校长 责任人
        VicePrincipalApprover vicePrincipalApprover = new VicePrincipalApprover("王副校长", 20000);

        //刘校长 责任人
        PrincipalApprover principalApprover = new PrincipalApprover("刘校长", 30000);

        //张主任决定不了的事情交给王副校长
        directorApprover.setApprover(vicePrincipalApprover);

        //王副校长决定不了的事情交给张主任
        vicePrincipalApprover.setApprover(principalApprover);

        //王校长所有事情都可以决定,但是当价格不足30000时,交给张主任处理 实现代码'闭环'!
        principalApprover.setApprover(directorApprover);


        //王校长购买材料 此时材料为1k, 交给张主任处理
        principalApprover.approvalRequest(materialScience);

    }
}
