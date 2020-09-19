import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCounter
{
	public static int count(String input)
	{
		String[] words = input.toLowerCase().replaceAll("[,\\.]", "").split("\\s+");
		Set uniqueWords = new HashSet(Arrays.asList(words));

		return uniqueWords.size();
	}
}
