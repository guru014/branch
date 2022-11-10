import java.util.LinkedHashSet;

public class guru {

	public static void main(String[] args)
	{
		String str = "i am from sdet42 i from batch";
		
		String[] l = str.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<>();
		for(int i=0;i<l.length;i++)
		{
			set.add(l[i]);
		}
		
		for(String x:set)
		{
			System.out.println(x + " ");
		}
	}

}
