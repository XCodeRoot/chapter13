package Day26.com.CodeRoot.wrapper;

public class Integer01 {
    public static void main(String[] args) {

        /**演示 int<-->Integer的装箱和拆箱
         *
         * jdk5以前是手动装箱和手动拆箱
         */
        //手动装箱:
        int n1=100;
        Integer integer=new Integer(n1);//第一种方法
        Integer integer1=Integer.valueOf(n1);//第二种方法

        //手动拆箱:
        int i=integer1.intValue();


        /**----------------------------------------------------
         *  jdk5以后
         */
        //自动装箱: int<-->Integer
        int n2=200;
        Integer integer2=n2;//底层使用的还是 Integer.valueOf(n2)

        //自动装箱: Integer-->int
        int n3=integer2;//底层仍然用的是 intValue（）方法
    }
}
