import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordCounterTests
{
	@Test
	public void count_WhenInputIsUniqueStringsDelimitedBySpace_ShouldReturnWordCount()
	{
		// Arrange
		WordCounter sut = new WordCounter();

		//Act
		String input = "This is a test";
		int output = WordCounter.count(input);

		//Assert
		assertThat(output).isEqualTo(4);
	}

	@Test
	public void count_WhenInputHasSameWords_ShouldReturnUniqueWordCount()
	{
		// Arrange
		WordCounter sut = new WordCounter();

		//Act
		String input = "This is a test and a good test";
		int output = WordCounter.count(input);

		//Assert
		assertThat(output).isEqualTo(6);
	}

	@Test
	public void count_WhenInputHasSameWordsButDifferentCapitalization_ShouldReturnUniqueWordCount()
	{
		// Arrange
		WordCounter sut = new WordCounter();

		//Act
		String input = "This is a test and a good Test";
		int output = WordCounter.count(input);

		//Assert
		assertThat(output).isEqualTo(6);
	}

	@Test
	public void count_WhenInputHasPunctuation_ShouldReturnUniqueWordCount()
	{
		// Arrange
		WordCounter sut = new WordCounter();

		//Act
		String input = "This is a test, and a good Test";
		int output = WordCounter.count(input);

		//Assert
		assertThat(output).isEqualTo(6);
	}


	@Test
	public void count_WhenInputHasMoreThanOneConsequentSpace_ShouldReturnUniqueWordCount()
	{
		// Arrange
		WordCounter sut = new WordCounter();

		//Act
		String input = "This is a test and a good     test";
		int output = WordCounter.count(input);

		//Assert
		assertThat(output).isEqualTo(6);
	}
}
