public class student {
    private String id;
    private String name;
    private int year;
    private String address;
    public student(String  id,String name,int year,String address){
        this.id=id;
        this.name=name;
        this.year=year;
        this.address=address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }
}