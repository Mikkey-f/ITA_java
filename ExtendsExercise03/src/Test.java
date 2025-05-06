public class Test {
    public static void main(String[] args){
        PC pc=new PC(10,20,30,"VECTOR");
        NotePad notepad=new NotePad(1000,2,70,"黑色");
        pc.print();
        notepad.print();
        pc.setCpu(2000);
        notepad.setMemory(88);
        System.out.println("更改后pc的信息");
        pc.print();
        System.out.println("更改后pc的信息");
        notepad.setColor("紫色");
        notepad.print();
    }
}
