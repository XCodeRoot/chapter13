package Day29.com.CodeRoot.stringbuilder;

public class StringBuilder {

    public static void main(String[] args) {


        /**
         *  StringBuilder用于单线程，StringBuffer用于单线程，所有方法均相同
         *
         */
        // 1. StringBuilder继承了父类 AbstractStringBuilder 类
        // 2. 实现了Serializable ，说明可以串行化（进行网络传输，也可以保存到文件）
        // 3. final类型，不能被继承
        // 4. StringBuilder对象字符序列 仍然是存放在其父类 AbstractStringBuilder 的 char[] value里，所以仍然存在堆里
        // 5. StringBuilder的方法，没有做互斥处理，即没有 synchonronized关键字，因此只能在单线程的情况下使用
        StringBuilder stringBuilder = new StringBuilder();
    }
}
