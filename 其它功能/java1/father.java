package java1;

public class father {
    private int money;
    private String pro;
    private String job;
    public father(int money,String pro,String job){
        this.money=money;
        this.pro=pro;
        this.job=job;
    }
    public father(){

    }
    public String getJob() {
        return job;
    }

    public int getMoney() {
        return money;
    }

    public String getPro() {
        return pro;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}
