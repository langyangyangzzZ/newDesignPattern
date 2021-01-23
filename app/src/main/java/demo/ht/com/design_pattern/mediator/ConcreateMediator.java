package demo.ht.com.design_pattern.mediator;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName ConcreateMediator
 * 时间: 2021/1/23 11:24
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 中介者模式 中介具体实现
 */
public class ConcreateMediator extends Mediator {

    //房东
    private final ArrayList<House> masterList;

    //租客
    private final ArrayList<House> tenantList;

    public ConcreateMediator() {
        masterList = new ArrayList<>();
        tenantList = new ArrayList<>();
    }


    @Override//房东注册房子
    public void registerMasterHouse(House house) {
        masterList.add(house);
    }

    @Override//房东移除房子
    public void removeMasterHouse(House house) {
        if (masterList.contains(house)) {
            masterList.remove(house);
        }
    }

    /**
     * 打印房东消息
     */
    public void printMasterHouse(){
        Iterator<House> iterator = masterList.iterator();
        while (iterator.hasNext()){
            House next = iterator.next();
            Log.i("中介者模式:","房东消息 :"+  next.getInfo());
        }
    }

    @Override//租客 租房子
    public void registerTenantHouse(House house) {
        tenantList.add(house);
    }

    @Override//租客移除房子
    public void removeTenantHouse(House house) {
        if (tenantList.contains(house)) {
            tenantList.remove(house);
        }
    }


    /**
     * 打印租客消息
     */
    public void printTenantHouse(){
        Iterator<House> iterator = tenantList.iterator();
        while (iterator.hasNext()){
            House next = iterator.next();
            Log.i("中介者模式:","租客消息 :"+  next.getInfo());
        }
    }
}
