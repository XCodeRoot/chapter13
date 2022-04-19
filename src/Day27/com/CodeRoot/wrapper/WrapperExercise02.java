package Day27.com.CodeRoot.wrapper;

public class WrapperExercise02 {

    public static void main(String[] args) {


        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==i);//false 因为不是同一个对象



        /**  关于自动装箱的细节 ：
         *      1.如果在 -127 ~ 128之间，则不new，而是直接返回这个数
         *      2.如果不在范围内，则new
         *
         *      Integer.valueof()的源码
         *     public static Integer valueOf(int i) {
         *         if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *         return new Integer(i);
         *     }
         */
        Integer m=1;//底层是  Integer m=Integer.valueof(1)
        Integer n=1;//底层是  Integer m=Integer.valueof(1)
        System.out.println(m==n);//true 因为 在范围内，所以自动装箱时 只返回数，而不新建对象


        Integer a=128;
        Integer b=128;
        System.out.println(a==b);//false 因为 不在范围内，所以自动装箱时，返回的是new出来的对象，两次new时，对象实际上是不同的
    }
}
