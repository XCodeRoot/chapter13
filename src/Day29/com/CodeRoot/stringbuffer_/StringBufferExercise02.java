package Day29.com.CodeRoot.stringbuffer_;

public class StringBufferExercise02 {

    public static void main(String[] args) {


        String price="123564.59";
        StringBuffer sb = new StringBuffer(price);

        // 1.先找到 小数点 的索引 sb.lastIndexOf(".")
        // 2. sb.lastIndexOf(".")-3,目的在于先判断是否满足三位，如果满足就在倒数第三位前加逗号“，“ 然后再 递减三位，看够不够三位
        for (int i = sb.lastIndexOf(".")-3;i>0;i-=3) {
            sb=sb.insert(i,",");//
        }
        System.out.println(sb);
    }
}
