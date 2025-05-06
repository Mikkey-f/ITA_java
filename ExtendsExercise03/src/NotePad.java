public class NotePad extends Computer{
    private String color;
    public NotePad(int cpu,int memory,int hard,String color){
        super(cpu,memory,hard);
        this.color=color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }
    public void print(){
        System.out.println("===notepad的信息===");
        System.out.println(getDtais()+" color="+color);
    }
}
