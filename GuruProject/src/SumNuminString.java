
public class SumNuminString {

	public static void main(String[] args) {
		String g="v2b13";
		 int sum = 0;
		
		for(int i=0;i<g.length();i++)
		{
			if(g.charAt(i)>='0' && g.charAt(i)<='9')
			{
				int n=g.charAt(i)-48;
				sum=sum+n;
			
			}
			
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}
