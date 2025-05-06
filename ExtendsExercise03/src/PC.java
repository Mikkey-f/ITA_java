public class PC extends Computer{
    private String brand;
    public PC(int cpu,int memory,int hard,String brand){
        super(cpu,memory,hard);
        this.brand=brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void print(){
        System.out.println("===pc的信息===");
        System.out.println(getDtais()+" brand="+brand);
    }
}
