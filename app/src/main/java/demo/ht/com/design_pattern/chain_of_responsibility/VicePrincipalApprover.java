package demo.ht.com.design_pattern.chain_of_responsibility;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName VicePrincipalApprover
 * 时间: 2021/1/27 14:54
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 责任链模式 副校长批准人
 */
public class VicePrincipalApprover extends Approver{
    /**
     * 可批准的价格
     */
    private float price;
    /**
     * 责任人名字
     */
    String name;


    public VicePrincipalApprover(String name,float price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void approvalRequest(MaterialScience materialScience) {
        if (materialScience.getPrice() < price) {
            Log.i("责任链模式","当前是 "+ name+" 批准");
        }else{
            //如果条件> 则让下一位责任人批准
            approver.approvalRequest(materialScience);
        }
    }
}
