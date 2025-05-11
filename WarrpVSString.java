public class WarrpVSString {
    public static void main(String[] args) {
        //包装类转String
        Integer i1=100;//自动装箱
        String str1=i1+"";
        String str2=String.valueOf(i1);
        String str3=String.valueOf(123);
        String str4=i1.toString();
        double d1=19.44;
        String str5=String.valueOf(d1);
        System.out.println(str5);
        Double d=d1;
        String str6=d.toString();
        System.out.println(str6);
        Double d2=Double.parseDouble(str6);
        System.out.println(d2);
        //String转包装类
        String str="1233";
        Integer i2=Integer.valueOf(str);
        Integer i3=Integer.parseInt(str);//自动装箱
        Integer i4=new Integer(str);
        System.out.println(str1+" "+str2+" "+str3+" "+str4+" "+str+" "+i1+" "+i2+" "+i3+" "+i4);
    }
}
