package demo.ht.com.design_pattern.instance_mode;

/**
 * @ClassName InstanceMode01
 * 作者: szj
 * 时间: 2021/1/6 14:19
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 * <p>
 * 双重检查(线程安全,效率高,懒加载) 推荐使用!
 */
public class InstanceMode06 {

    /**
     * 私有化构造器 外部不能  new
     */
    private InstanceMode06() {
    }

    /**
     *    volatile:防止JVM优化被禁止重排序的。
     *      重排序是指编译器和处理器为了优化程序性能而对指令序列进行重新排序的一种手段。
     */
    private static volatile InstanceMode06 instance;
    /*
     *  volatile解决问题:
     *
     * 当第二次执行,instance不为null时，仍可能指向一个"被部分初始化的对象"。
     *
     *  问题出在第5行:
     *
     *  在new创建变量的时候 instance = new InstanceMode06();
     *
     *  它并不是一个原子操作。事实上，它可以”抽象“为下面几条JVM指令：
                memory = allocate();　　// 1：分配对象的内存空间
                ctorInstance(memory);　// 2：初始化对象
                instance = memory;　　// 3：设置instance指向刚分配的内存地址
                *
      *  操作2依赖于操作1，但是操作3并不依赖于操作2,所以JVM可以以“优化”为目的对它们进行重排序，经过重排序后如下：
                 memory = allocate();　　// 1：分配对象的内存空间
                instance = memory;　　// 3：设置instance指向刚分配的内存地址
                // 注意，此时memory对象还没有被初始化！
                ctorInstance(memory);　// 2：初始化对象
      *
      * 这样做有什么区别呢?
      * 正常情况是先分配对象的内存空间,然后初始化,最后instance指向分配的内存地址
      * 现在有可能是先分配对象,然后直接指向内存地址,最后在初始化对象,
      * 那么就有可能赵成实例不同的情况
      *
     */


    /*
     * 为什么要使用双重校验锁?
     *
     *  当同步的情况下线程A和线程B同时到3时,因为是同步所以线程A先进去创建对象,
     *
     *  线程B在外面等待,当线程A结束后,线程B在进入,当线程B走到4时判断instance == null
     *
     *  此时实例已经创建,则不在重新创建实例
     *
     *  当再有新的线程创建的时候,此时实例已经创建完成,走到2时,则直接返回当前实例,不进行线程同步
     *
     * 提供一个共有方法 使用到时才去创建intance
     * 双重校验,保证了代码的线程安全,解决了懒加载问题
     */
    /*1*/
    public static InstanceMode06 getInstance() {
        /*2*/
        if (instance == null) {
            /*3*/
            synchronized (InstanceMode06.class) {
                /*4*/
                if (instance == null) {
                    /*5*/
                    instance = new InstanceMode06();
                }
            }
        }
        return instance;
    }
}
