import java.util.HashSet;
import java.util.Set;

public class PanagramString {
	public static void main1(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
;
		if(isPanagram(str))
		{
			System.out.println("The strings are anagrams.");
		}
		else {
			System.out.println("Not panagram");
		}
	}
	
	public static boolean isPanagram(String str)
	{
		Set<Character> set = new HashSet<>();
		str = str.toLowerCase();
		
		for(char ch : str.toCharArray())
		{
			if(ch >= 'a' && ch <= 'z')
			{
				set.add(ch);
			}
		}
		
		if(set.size() == 26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		
		int arr[] = new int[26];
		
		str = str.toLowerCase();
		
		
	}
}
