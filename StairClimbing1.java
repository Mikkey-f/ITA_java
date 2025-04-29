import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StairClimbing1
{

	//main·½·¨
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n==1)
		{
			System.out.println(1);
			return ;
		}
		if(n==2)
		{
			System.out.println(2);
			return ;
		}
		List<Integer> prev2=new ArrayList<>();//´ÓÇ°Á½½×¿çÁ½²½×ßÉÏÀ´µÄ·½·¨Êý
		List<Integer> prev1=new ArrayList<>();//´ÓÇ°Ò»½×¿çÒ»²½×ßÉÏÀ´µÄ·½·¨Êý
		List<Integer> now=new ArrayList<>();//×ßµ½µ±Ç°½×ÌÝµÄ·½·¨Êý
		//¶¯Ì¬¹æ»®
		for(int i=3;i<=n;i++)
		{
			now=highAdd(prev1,prev2);
			prev2=new ArrayList<>(prev1);
			prev1=new ArrayList<>(now);
		}
		for(int i=now.size()-1;i>=0;i--)
		{
			System.out.print(now.get(i));
		}
	}


	//highAdd·½·¨ ¾²Ì¬·½·¨
	public static List<Integer> highAdd(List<Integer>prev1,List<Integer>prev2)
	{
		List<Integer> res=new ArrayList<>();
		int carry=0;
		int temp=0;
		for(int i=0;i<prev1.size()||i<prev2.size();i++)
		{
			temp+=carry;
			if(i<prev1.size())
				temp+=prev1.get(i);
			if(i<prev2.size())
				temp+=prev2.get(i);
			res.add(temp%10);
			carry=temp/10;
			temp=0;
		}
		while(carry!=0)
		{
			res.add(carry%10);
			carry/=10;
		}
		return res;
	}
}