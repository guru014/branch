
public class PrintcountsofOvels {

	public static void main(String[] args) {
		 String s = "kashmira"; 
		 
		 
		 int a = 0;
		 int I=0;
		 
		 
		 for(int i=0;i<s.length();i++)
		 {
			char ch = s.charAt(i);
			
			if(ch=='a')
			{
				a++;
				System.out.println(ch + "  [count]  " + a);
				
			}
			
			if(ch=='i')
			{
				I++;
				System.out.println(ch + "  [count] " + I);
			}
		 }
	}

}
