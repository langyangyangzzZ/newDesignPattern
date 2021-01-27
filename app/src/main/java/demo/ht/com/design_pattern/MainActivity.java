package demo.ht.com.design_pattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import demo.ht.com.design_pattern.Interpreter_pattern.InterpreterManager;
import demo.ht.com.design_pattern.Iterator_pattern.IteratorManager;
import demo.ht.com.design_pattern.adapter_mode.AdapterManager;
import demo.ht.com.design_pattern.bridge_mode.BridgeManager;
import demo.ht.com.design_pattern.builder_mode.BuilderManager;
import demo.ht.com.design_pattern.chain_of_responsibility.ChainManager;
import demo.ht.com.design_pattern.command_pattern.CommandManger;
import demo.ht.com.design_pattern.composite_mode.CompositeManager;
import demo.ht.com.design_pattern.decorator_mode.DecoratorManager;
import demo.ht.com.design_pattern.facade_mode.FacadeManager;
import demo.ht.com.design_pattern.factory_mode.FactoryManager;
import demo.ht.com.design_pattern.flyweight_mode.FlyWeightManger;
import demo.ht.com.design_pattern.instance_mode.InstanceManager;
import demo.ht.com.design_pattern.mediator.MediatorManager;
import demo.ht.com.design_pattern.memento_pattern.MementoManager;
import demo.ht.com.design_pattern.observer_pattern.ObserverManager;
import demo.ht.com.design_pattern.proto_type.ProtoTypeManager;
import demo.ht.com.design_pattern.proxy_mode.ProxyManager;
import demo.ht.com.design_pattern.state_pattern.StateManager;
import demo.ht.com.design_pattern.strategy_pattern.StrategyManager;
import demo.ht.com.design_pattern.template_method_pattern.TemplateManager;
import demo.ht.com.design_pattern.utils.DesignPatternManager;
import demo.ht.com.design_pattern.visitor_pattern.VisitorManager;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName StateManager
 * 时间: 2021/1/26 14:28
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DesignPatternManager dpManager = new DesignPatternManager();

        /*
         * 创建型
         */
        builDestablish(dpManager);

        /*
         *结构型
         */
        builDstructure(dpManager);

        /*
         * 行为型
         */
        buildBehavior(dpManager);

    }

    /**
     * 行为型 11种
     */
    private void buildBehavior(DesignPatternManager dpManager) {
        //模板方法模式
        dpManager.showDeignPattern(new TemplateManager());

        //命令模式
        dpManager.showDeignPattern(new CommandManger());

        //访问者模式
        dpManager.showDeignPattern(new VisitorManager());

        //迭代器模式
        dpManager.showDeignPattern(new IteratorManager());

        //观察者模式
        dpManager.showDeignPattern(new ObserverManager());

        //中介者模式
        dpManager.showDeignPattern(new MediatorManager());

        //备忘录模式
        dpManager.showDeignPattern(new MementoManager());

        //解释器模式
        dpManager.showDeignPattern(new InterpreterManager());

        //状态模式
        dpManager.showDeignPattern(new StateManager());

        //策略模式
        dpManager.showDeignPattern(new StrategyManager());

        //责任链模式
        dpManager.showDeignPattern(new ChainManager());

    }

    /**
     * 结构型 7种
     */
    private void builDstructure(DesignPatternManager dpManager) {
        //适配器模式
        dpManager.showDeignPattern(new AdapterManager());

        //桥接模式
        dpManager.showDeignPattern(new BridgeManager());

        //代理模式
        dpManager.showDeignPattern(new ProxyManager());

        //装饰器模式
        dpManager.showDeignPattern(new DecoratorManager());

        //组合模式
        dpManager.showDeignPattern(new CompositeManager());

        //外观模式
        dpManager.showDeignPattern(new FacadeManager());

        //享元模式
        dpManager.showDeignPattern(new FlyWeightManger());
    }

    /**
     * 创建型 5种
     */
    private void builDestablish(DesignPatternManager dpManager) {
        //单例模式
        dpManager.showDeignPattern(new InstanceManager());

        //工厂模式
        dpManager.showDeignPattern(new FactoryManager());

        //原型模式
        dpManager.showDeignPattern(new ProtoTypeManager());

        //建造者模式
        dpManager.showDeignPattern(new BuilderManager());
    }
}