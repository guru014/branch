
public class SagregateAlphNum {

	public static void main(String[] args)
	{
		String s="2a3@&4*bc";
		
		String alph=" ";
		String num=" ";
		String spc=" ";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)>='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alph=alph+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
				
			}
			
			else {
				spc=spc+s.charAt(i);
				
			}
		}
		System.out.println(alph+num+spc);

	}

}
