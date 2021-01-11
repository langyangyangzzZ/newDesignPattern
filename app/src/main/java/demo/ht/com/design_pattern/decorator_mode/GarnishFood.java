package demo.ht.com.design_pattern.decorator_mode;

/**
 * @ClassName GarnishFood
 * 作者: szj
 * 时间: 2021/1/9 17:07
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 装饰食物类
 */
public abstract class GarnishFood extends Food {

    Food food;

    public GarnishFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
