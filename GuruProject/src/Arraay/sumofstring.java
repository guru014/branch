package Arraay;

public class sumofstring {

	public static void main(String[] args) {
		String s1 = "abc123ab45";
		String num = "";
		int sum=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				num=num+s1.charAt(i);
				
			}
		}
		char[] ch = num.toCharArray();
		
		for(int x:ch)
		{
			sum=sum+(x-48);
		
		}
	
		System.out.println(sum);
	}

}
