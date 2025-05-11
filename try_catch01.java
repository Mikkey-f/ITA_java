public class try_catch01 {
    public static void main(String[] args) {
        try {
            String name="hsp";
            int a=Integer.parseInt(name);
            System.out.println("数字"+a);
        } catch (NumberFormatException e) {
            System.out.println("哈哈哈");
            throw new RuntimeException(e);
        }finally{
            System.out.println("红红火火恍恍惚惚");
        }
        System.out.println("哈哈");
        try {
            int[] nums={1,2,3};
            for (int i=0;i<=3;i++) {
                System.out.println(nums[i]);
            }
        } catch (Exception e) {
            System.out.println("捕获啦！");
            //throw new RuntimeException(e);
            System.out.println("ok");
        }

    }
}
