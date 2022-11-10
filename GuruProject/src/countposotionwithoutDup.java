import java.util.LinkedHashSet;

public class countposotionwithoutDup {

	public static void main(String[] args) {
		String str = "i am from sdet42 i from batch";
		String[] s = str.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<>();
		
	for(int i=0; i<s.length;i++)
	{
		set.add(s[i]);
		
	}
	for(String x:set)
	{
		int count = 0;
		for(int i=0; i<s.length;i++)
		{
			
			if(x.equals(s[i]))
			{
				System.out.println(x + " [its poostion] " + i);
				break;
			}
		}
	}

	}

}
