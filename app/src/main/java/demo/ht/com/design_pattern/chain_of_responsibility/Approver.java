package demo.ht.com.design_pattern.chain_of_responsibility;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName Approver
 * 时间: 2021/1/27 14:52
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 责任链模式 批准人抽象类
 */
public abstract class Approver {

    /**
     * 下一个责任人
     */
    Approver approver;

    /**
     * 请求批准接口
     */
    public abstract void approvalRequest(MaterialScience materialScience);

    //设置批准人
    public void setApprover(Approver approver) {
        this.approver = approver;
    }
}
