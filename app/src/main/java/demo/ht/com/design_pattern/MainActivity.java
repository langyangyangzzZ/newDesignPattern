package demo.ht.com.design_pattern;

import androidx.appcompat.app.AppCompatActivity;
import demo.ht.com.design_pattern.instance_mode.InstanceManager;
import demo.ht.com.design_pattern.instance_mode.InstanceMode01;
import demo.ht.com.design_pattern.instance_mode.InstanceMode02;
import demo.ht.com.design_pattern.instance_mode.InstanceMode03;
import demo.ht.com.design_pattern.instance_mode.InstanceMode04;
import demo.ht.com.design_pattern.instance_mode.InstanceMode05;
import demo.ht.com.design_pattern.instance_mode.InstanceMode06;
import demo.ht.com.design_pattern.instance_mode.InstanceMode07;
import demo.ht.com.design_pattern.instance_mode.InstanceMode08;
import demo.ht.com.design_pattern.utils.MainManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainManager mainManager = new MainManager();
        //单例模式
        mainManager.showDeignPattern(new InstanceManager());

    }
}