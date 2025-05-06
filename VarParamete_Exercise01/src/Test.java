public class Test {
    public static void main(String[] args){
        Method method=new Method();
        System.out.println(method.showScore("小美",0));
        System.out.println(method.showScore("小明",12,13.5));
        System.out.println(method.showScore("小红",11,40,15.8));
    }

}
class Method{
    public String showScore(String name,double...score){
            double sum=0;
            for(int i=0;i<score.length;i++)
                sum+=score[i];
            return name+"有"+score.length+"门课程的总成绩为"+sum;
    }
}



