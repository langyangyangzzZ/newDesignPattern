package demo.ht.com.design_pattern;

import androidx.appcompat.app.AppCompatActivity;
import demo.ht.com.design_pattern.factory_mode.FactoryManager;
import demo.ht.com.design_pattern.instance_mode.InstanceManager;
import demo.ht.com.design_pattern.utils.DesignPatternManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DesignPatternManager dpManager = new DesignPatternManager();
        //单例模式
        dpManager.showDeignPattern(new InstanceManager());


        //工厂模式
        dpManager.showDeignPattern(new FactoryManager());

    }
}