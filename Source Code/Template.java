package abstract_.detail;

public abstract  class Template {//抽象类—模板设计模式
    public abstract void job();
    public void calculateTime() {
        //得到开始时间
        long start = System.currentTimeMillis();
        job();//动态绑定机制
        //跳到子类实例对象去执行job方法，再回来
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间：" + (end - start));

    }
}