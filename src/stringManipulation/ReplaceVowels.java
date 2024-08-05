package stringManipulation;

public class ReplaceVowels {

	public static void main(String[] args) 
	{
		ReplaceVowels r1 = new ReplaceVowels();
		r1.vowelReplacement("India is a beautiful country");
	}

	public void vowelReplacement(String str)
	{
		StringBuilder sb = new StringBuilder();
		
		for(char c: str.toCharArray())
		{
			switch(c) 
			{
			case 'a': sb.append('e');
			break;
			
			case 'e': sb.append('i');
			break;
			
			case 'i': sb.append('o');
			break;
			
			case 'o': sb.append('u');
			break;
			
			case 'u': sb.append('a');
			break;
			
			default: 
				sb.append(c);
				
		}
			
	}
		System.out.println(sb);
		

}
}