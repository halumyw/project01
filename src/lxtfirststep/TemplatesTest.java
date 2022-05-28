package lxtfirststep;

import com.atlxt.bean.Custormer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lxtlxt
 * @create 2022-05-14-17:35
 * 
 * 
 * 代码模板:settings - editor - live templates / general - postfix completion
 * 常用模板
 */
public class TemplatesTest {
    //        模板6:prsf   大写:ctrl+shift+u
    private static final Custormer CUST = new Custormer();
//    扩展:psf/psfi/psfs
    public static final int NUM = 1;
    public static final int NUM1 = 2;
    public static final String NATION = "CHINA";
//    模板1: psvm/main
    public static void main(String[] args) {
//        模板2:sout
        System.out.println("hello");
//        扩展:soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        int num2 = 11;
        System.out.println("num2 = " + num2);
        System.out.println(num1);//xxx.sout



//        模板3:fori
        String[] arr = new String[]{"tom","jerry","shuichangchang","kaikai"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        扩展:iter/itar
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

//        模板4:list.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }
//        扩展:list.fori / list.forr(两个方向遍历)
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

//        模板5:ifn
        if (list == null) {

        }
//        扩展:inn/xxx.nn/xxx.null
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }




    }

}
