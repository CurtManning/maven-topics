package week3.day2.testclasses;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day2.appcode.HashSetExamples;

public class HashSetExamplesTest {

	@Test
	public void hashSetExamplesTest() {

		Set<String> expectedSet = new HashSet<String>();

		expectedSet.add("Orange");
		expectedSet.add("Apple");
		expectedSet.add("Grapes");
		expectedSet.add("Fig");
		expectedSet.add("Mango");
		expectedSet.add(null);

		Reporter.log("HashSetExamplesTest.hashSetExamplesTest -> " + "HashSetExamples.hashSetExample", true);
		
		Set<String> results = HashSetExamples.hashSetExample();
		String expectedString = util.ArrayStringParser.toSortedString(expectedSet+"");
		String resultsString = util.ArrayStringParser.toSortedString(results+"");

		Assert.assertEquals(expectedString, resultsString);

	}

	@Test
	public void linkedHashSetExampleTest() {

		Set<String> expectedLinkedHashSet = new LinkedHashSet<String>();
		expectedLinkedHashSet.add("BMW");
		expectedLinkedHashSet.add("Audi");
		expectedLinkedHashSet.add("Honda");

		Reporter.log("HashSetExamplesTest.linkedHashSetExampleTest -> " + "HashSetExamples.linkedHashSetExample", true);
		Set<String> expectedResults = HashSetExamples.linkedHashSetExample();

		Assert.assertEquals(expectedLinkedHashSet, expectedResults);

	}

}
