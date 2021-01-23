package demo.ht.com.design_pattern.mediator;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Mediator
 * 时间: 2021/1/23 11:22
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 中介者模式抽象类
 */
public abstract class Mediator {

    //TODO 房东
    public abstract void registerMasterHouse(House house);

    //移除房东
    public abstract void removeMasterHouse(House house);


    //租客 注册
    public abstract void registerTenantHouse(House house);

    //移除租客
    public abstract void removeTenantHouse(House house);

}
