
public class StringReverse {

	public static void main(String[] args) {
		
		
		
		String s="Rohit";
		String t="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			t=t+s.charAt(i);
		}
		
		System.out.println(t);
		
		
		if(s==t)
		{
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println("String not palindrome ");
		}
		
		
		StringBuffer bf=new StringBuffer("Rahul");
		System.out.println(bf.reverse());
		
		
		StringBuilder br=new StringBuilder("Nlesh");
		System.out.println(br.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
