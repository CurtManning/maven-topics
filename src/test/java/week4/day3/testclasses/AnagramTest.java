package week4.day3.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day3.appcode.AnagramsExercise;

public class AnagramTest {
	
	@Test
	public void isAnagramTest() {

		String word1 = ("stop");
		String word2 = ("pOts");
		Reporter.log("isAnagram", true);

		Assert.assertTrue( AnagramsExercise.isAnagram(word1, word2));
	}
	
	@Test
	public void isAnagramStringBuilderTest() {

		String word1 = ("stop");
		String word2 = ("pOts");
		Reporter.log("isAnagramStringBuilder", true);

		Assert.assertTrue( AnagramsExercise.isAnagramStringBuilder(word1, word2));
	}

}
