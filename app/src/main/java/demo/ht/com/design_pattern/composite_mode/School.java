package demo.ht.com.design_pattern.composite_mode;

/**
 * @ClassName School
 * 作者: szj
 * 时间: 2021/1/11 14:14
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 组合模式 学校类 (用来定义规范)
 */
public abstract class School {
    /**
     * 名字
     */
    private String name;
    private  String grade;

    /**
     *  添加
     */
    public void add(School school){
    }

    /**
     *  删除
     */
    public void remove(School school){
    }


    public School(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    abstract void print();
}
