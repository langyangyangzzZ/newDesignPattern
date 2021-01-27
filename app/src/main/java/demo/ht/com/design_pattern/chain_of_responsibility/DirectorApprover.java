package demo.ht.com.design_pattern.chain_of_responsibility;

import android.util.Log;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName DirectorApprover
 * 时间: 2021/1/27 14:53
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 责任链模式 主任批准
 */
public class DirectorApprover extends Approver {
    private float price;
    /**
     * 责任人名字
     */
    String name;
    public DirectorApprover(String name,float price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void approvalRequest(MaterialScience materialScience) {
        if (materialScience.getPrice() < price) {
            Log.i("责任链模式","当前是 "+ name+" 批准");
        }else{
            //如果请求不满足 去下一个责任人哪里判断
            approver.approvalRequest(materialScience);
        }
    }
}
