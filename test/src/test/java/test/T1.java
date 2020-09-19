package test;

/**
 * @ProjectName: cloud2020
 * @Package: test
 * @ClassName: T1
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/19 20:51
 */
public class T1 {
    public static void main(String[] args) {
        String str1 = "通话 ";
        String str2 = "重地";
        System. out. println(String. format("str1：%d | str2：%d",  str1. hashCode(),str2. hashCode()));
        System. out. println(str1. equals(str2));
    }



}
