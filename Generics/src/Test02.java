import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<Pig> pigs=new ArrayList<>();
        pigs.add(new Pig());
        Iterator<Pig> it=pigs.iterator();

    }
}
class Pig{
    private String name;
}
