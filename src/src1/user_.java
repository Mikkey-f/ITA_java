package src1;

public class user_ {
    public String name;
    private String no;
    private String id;
    private String card;
    public user_(String name,String no,String id,String card){
        this.name=name;
        this.no=no;
        this.id=id;
        this.card=card;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCard() {
        return card;
    }

    public String getNo() {
        return no;
    }
}
