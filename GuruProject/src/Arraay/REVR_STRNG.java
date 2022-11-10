package Arraay;

public class REVR_STRNG {

	public static void main(String[] args) 
	{
		
        String s1="Guru@123 hello";
        String rev = "";
        
       String[] ch = s1.split(" ");
       
       for(String x:ch)
       {
    	 for(int i=x.length()-1; i>=0;i--)
    	 {
    		 rev=rev+x.charAt(i);
    		 
    	 }
    	 System.out.println(" "+rev);
       }
       
       
	}

}
