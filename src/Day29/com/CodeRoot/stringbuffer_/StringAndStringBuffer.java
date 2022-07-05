package Day29.com.CodeRoot.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {

        //String -> StringBuffer -------------------------------------------------
        String str = "Hello";

        //方式 1 ，使用构造器
        //注意，返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式 2 ，使用 append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //StringBuffer -> String --------------------------------------------------

        //方式 1  使用StringBuffer提供的toString方法
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        String s = stringBuffer2.toString();

        //方式 2  使用构造器
        String s1=new String(stringBuffer2);


    }
}


