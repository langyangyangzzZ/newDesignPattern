package demo.ht.com.design_pattern.proxy_mode.demo02;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import demo.ht.com.design_pattern.proxy_mode.demo01.HouseMaster;

/**
 * @ClassName ProxyInvocationHandler
 * 作者: szj
 * 时间: 2021/1/9 11:25
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 代理模式 调用处理程序  (自动生成代理类)
 */
public class ProxyInvocationHandler implements InvocationHandler {

    Object object;

    //参数一:object 具体接口的实现类
    public ProxyInvocationHandler(Object object) {
        this.object = object;
    }


    //生成代理类  返回的是被代理的接口 (返回的是object接口)
    public Object getProxy(){
        /**
         * this.getClass().getClassLoader() 加载类所在位置
         * object.getClass().getInterfaces() 代理的接口
         * this  表示本身:InvocationHandler
         */
       return Proxy.newProxyInstance(
               this.getClass().getClassLoader(),
               object.getClass().getInterfaces(),
               this
       );
    }

    /**
     * @param proxy 调用该方法的代理实例
     * @param method  所述方法对应于调用代理实例上的接口方法的实例。 方法对象的声明类将是该方法声明的接口，它可以是代理类继承该方法的代理接口的超级接口。
     * @param args 包含的方法调用传递代理实例的参数值的对象的阵列，或null如果接口方法没有参数。
     *             原始类型的参数包含在适当的原始包装器类的实例中，例如java.lang.Integer或java.lang.Boolean 。
     * @return
     * @throws Throwable
     */
    @Override  //处理代理实例,返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        msg(method.getName());
        Object invoke = method.invoke(object, args);
        return  invoke;
    }

    public void msg(String msg){
        Log.i("代理模式","代理了"+msg+"方法");
    }
}
