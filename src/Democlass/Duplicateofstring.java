package Democlass;

public class Duplicateofstring {

	public static void main(String[] args) {
		String s ="Mahabharat";
		s = s.toLowerCase();
		String s1 = s;
		for(char ch ='a'; ch<='z'; ch++)
		{
			int Count=0;
			for(int i=0; i<s.length(); i++)
			{
				char c = s.charAt(i);
				if(ch==c)
				{
					Count++;
				}
			}
				if(Count>1) {
					String s2 =ch +"";
					s1 = s1.replace(s2, "");
				}
				
			
		}
		System.out.println("String Without Duplicate:"+ s1);
		
	}

}
