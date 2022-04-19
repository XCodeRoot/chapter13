package Day27.com.CodeRoot.string_.String01;

public class String01 {
    public static void main(String[] args) {

        /** String 的源码里，有一个属性 ，专门用于 字符存储
         *
         * The value is used for character storage.
         *
         * private final char value[];
         *
         */
        String a="jack"; //实际上字符串的本质还是字符数组
        // String源码里的 value[] 为char类型数组，用来存储字符串里的每个字符
        // value[] 也是个final类型，所以是常量，一旦赋值，则不可以修改（指地址），
        // value不能修改，因为value[]是final类型，value的值是第一个字符的地址，所以不能修改其地址，也叫不能修改它的值

        String b="jack";
        System.out.println(a.equals(b));// true

        String c=new String("jack");
        System.out.println(a.equals(c));//  T
        System.out.println(a==c);// F
        /**
         *  intern() 是String里的方法，用于返回 常量池里的 字符串
         *  最终返回的还是 常量池里 字符串 的地址
         */
        System.out.println(a==b.intern());// T ，a指向常量池的“jack”的地址 ， b.intern（）指的就是 常量池里的那个 “jack”地址
        System.out.println(b==b.intern());// F ，b指向堆，所以是 F
    }
}
