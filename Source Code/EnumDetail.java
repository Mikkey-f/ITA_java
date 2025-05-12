package enum_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSMUSIC.playing();
    }
}
interface IP{
    public void playing();
}
enum Music implements IP{
    CLASSMUSIC;
    public void playing(){
        System.out.println("播放好听的音乐。。。。。");
    }
}