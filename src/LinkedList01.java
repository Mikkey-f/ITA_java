//双向链表的实现代码
public class LinkedList01 {
    public static void main(String[] args) {
        Node jack=new Node("jack");
        Node hsp=new Node("hsp");
        Node ljw=new Node("ljw");
        Node first=jack;//让first引用指向jack，jack就是first，就是头结点啊
        jack.next=hsp;
        hsp.next=ljw;
        Node last=ljw;//让last引用指向ljw，ljw就是尾结点
        ljw.pre=hsp;
        hsp.pre=jack;
        //从前往后遍历
        while(first!=null){
            System.out.println(first);
            first=first.next;
        }
        //从后往前遍历
        while(last!=null){
            System.out.println(last);
            last=last.pre;
        }
        //添加元素
        Node cxk=new Node("cxk");
        hsp.next=cxk;
        cxk.next=ljw;
        ljw.pre=cxk;
        cxk.pre=hsp;
        first=jack;
        while(first!=null){
            System.out.println(first);
            first=first.next;
        }
        first=jack;
        //last=ljw;
        Node smith=new Node("smith");
        ljw.next=smith;
        smith.pre=ljw;
        last=smith;
        System.out.println("==========");
        while(last!=null){
            System.out.println(last);
            last=last.pre;
        }
    }
}
class Node{
    public Object item;//此节点存放的对象
    public Node pre;//前一个节点
    public Node next;//下一个节点
    public Node(Object name){//其他的没有初始化的就是为空，初始化item
        this.item=name;
    }
    public String toString(){
        return "Node Name:"+item;
    }
}