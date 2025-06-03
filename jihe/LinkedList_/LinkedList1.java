package LinkedList_;

public class LinkedList1 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");

        //连接三个节点,形成双向链表
        //jack->tom->hsp
        jack.next=tom;
        tom.next=hsp;
        //hsp->tom->jack
        hsp.pre=tom;
        tom.pre=jack;

        Node first=jack;//让first引用指向jack,就是双向链表的头节点
        Node last=hsp;//让last引用指向hsp, 就是双向链表的尾节点

        //从头到尾进行遍历
        while (true){
            if(first==null){
                break;
            }
            //输出first 信息
            System.out.println(first);
            first=first.next;
        }

        //从尾到头遍历
        while (true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last=last.pre;
        }

        //链表添加数据
        //需求: 在tom和hsp之间插入一个对象 usao
        Node usao = new Node("usao");
        tom.next=usao;
        usao.pre=tom;
        usao.next=hsp;
        hsp.pre=usao;
    }
}

//定义一个Node类, Node 对象表示双向链表的一个结点
class Node{
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个结点
    public Node pre;//指向前一个结点
    public Node(Object name){
        this.item=name;
    }
    public String toString(){
        return "Node name="+item;
    }
}