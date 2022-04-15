package Day26.com.CodeRoot.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {

        // 包装类（Integer）--> String
        Integer i = 100;//自动装箱

        String str1 = i + "";//方式一

        String str2 = i.toString();//方式二

        String str3 = String.valueOf(i);//方式三


        // String --> 包装类（Integer）
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4); //使用自动装箱，方式一
        Integer i3 = new Integer(str4);//构造器 方式二
    }
}
