package list_;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class linkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node szj = new Node("szj");

        jack.next = tom;
        tom.next = szj;
        tom.pre = jack;
        szj.pre = tom;
        Node first = jack;
        Node last = szj;
        //遍历
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}