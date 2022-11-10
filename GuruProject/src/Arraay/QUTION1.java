package Arraay;


public class QUTION1 {

	public static void main(String[] args) {
		String g = "Gudddi@1234";
	String s1 = g.toLowerCase();
		String alpha = "";
		
		 String num = "";
		 String spcl="";
		
	for(int i=0; i<s1.length();i++)
	{
		if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		{
			alpha=alpha+ s1.charAt(i);
		}
		else if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
		{
			num=num+s1.charAt(i);
		}
		
		else
		{
			spcl=spcl+s1.charAt(i);
		}
	}
             System.out.println(alpha);
             System.out.println(num);
             System.out.println(spcl);
	}

}
