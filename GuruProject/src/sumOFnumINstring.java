
public class sumOFnumINstring {

	public static void main(String[] args) 
	{
		String s = "vB25h10k2";
		int sum=0;
		int tsum = 0;
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			
			if(ch>='0'&& ch<='9')
			{
				int n = ch-48;
				tsum=tsum*10+n;
				
			}
			else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		
       System.out.println(sum);
	}

}
