package demo.ht.com.design_pattern.mediator;

import demo.ht.com.design_pattern.utils.DesignPattern;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName MediatorManager
 * 时间: 2021/1/23 10:49
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 中介者模式
 */
public class MediatorManager implements DesignPattern {
    @Override
    public void showDesignPattern() {
        //中介者
        ConcreateMediator concreateMediator = new ConcreateMediator();

        //房东 吧房子交给中介者
        MasterHouse masterHouse = new MasterHouse(concreateMediator);
        MasterHouse masterHouse2 = new MasterHouse(concreateMediator);
        MasterHouse masterHouse3 = new MasterHouse(concreateMediator);

        //房东发送消息
        masterHouse.sendInfo("北京市丰台区丰台接到幸福小区1单元1号楼 2000/月 ");
        masterHouse2.sendInfo("北京市丰台区丰台接到幸福小区1单元1号楼 4000/月 ");
        masterHouse3.sendInfo("北京市丰台区丰台接到幸福小区1单元1号楼 6000/月 ");

        //删除房东3 的消息
        concreateMediator.removeMasterHouse(masterHouse3);

        //打印租客发送的消息
        concreateMediator.printMasterHouse();



        //租客
        TenantHouse tenantHouse = new TenantHouse(concreateMediator);

        //租客租房子
        tenantHouse.sendInfo("我想在丰台租一个一室一厅1000 - 1500元/月,年初去北京发展很急!");
        //打印租客发送的消息
        concreateMediator.printTenantHouse();


        /////////////// 扩展 \\\\\\\\\\\\\\\\\\
        //女性租客
        WomanHouse womanHouse = new WomanHouse(concreateMediator);

        womanHouse.sendInfo("我是女性,我想在丰台区和女性合租, 1300/月");
        //打印租客发送的消息
        concreateMediator.printTenantHouse();

    }
}
