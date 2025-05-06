public class Computer {
    //属性
    private int cpu;
    private int memory;
    private int hard;
    //构造方法
    public Computer(){}
    public Computer(int cpu,int memory,int hard){
        this.cpu=cpu;
        this.memory=memory;
        this.hard=hard;
    }
    //setter
    public void setCpu(int cpu){
        this.cpu=cpu;
    }
    public void setMemory(int memory){
        this.memory=memory;
    }
    public void setHard(int Hard){
        this.hard=hard;
    }
    //getter
    public int getCpu(){
        return this.cpu;
    }
    public int getMemory(){
        return this.memory;
    }
    public int getHard(){
        return this.hard;
    }
    //getDtails方法
    public String getDtais(){
        return "cpu="+cpu+" memory="+memory+" hard="+hard;
    }
}
