package Democlass;

public class Consoccurence {
	
	public static void main(String[] args) {
		String s = "adithi";
		s=s.toLowerCase();
		String cons = "bcdfghjklmnpqrstvwxyz";
		for(int i=0; i<cons.length(); i++)
		{
		  char ch1=cons.charAt(i);
		  {
		    int count=0;
		    for(int j=0; j<s.length(); j++)
		    {
		    	char ch2= s.charAt(j);
		    	if(ch1==ch2)
		    	{
		    		count++;
		    		
		    	}
		    	
		    }
		    	if(count>0) 
		    	{
		    		System.out.println(ch1 + "print consonant "+ count + "time");
		    	}
		    }
		    	
		   
		}
		    	
	}
		  
 }

