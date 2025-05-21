package tankgame3;

//自己的坦克
public class Hero extends Tank {
    //定义一个shoot对象,表示一个射击行为
    private Shoot shoot=null;
    public Hero(int x,int y){
        super(x,y);
    }
    public void shotEnemy(){
        //创建shoot, 根据当前hero的位置和方向来创建对象
        switch (getDirect()/*坦克的方向*/){
            case 0://上
                shoot=new Shoot(getX()+20,getY(),0);
                break;
            case 1://右
                shoot=new Shoot(getX()+60,getY()+20,1);
                break;
            case 2://下
                shoot=new Shoot(getX()+20,getY()+60,2);
                break;
            case 3://左
                shoot=new Shoot(getX(),getY()+20,3);
                break;

        }
         //启动射击的shoot线程
        new Thread(shoot).start();
    }

}
