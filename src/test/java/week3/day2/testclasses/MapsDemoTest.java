package week3.day2.testclasses;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day2.appcode.MapsDemo;

public class MapsDemoTest {

	@Test
	public void mapsDemotest() {

		Map<Integer, String> expectedMap = new HashMap<Integer, String>();
		expectedMap.put(49, "Ajeet");
		expectedMap.put(2, "BMW");
		expectedMap.put(4, "Merc");
		expectedMap.put(7, "Singh");
		expectedMap.put(12, "Chaitanya");

		Reporter.log("MapsDemoTest.mapsDemotest -> " + "MapsDemoTest.mapsDemotest", true);
		Map<Integer, String> expectedResults = MapsDemo.mapsDemo();
		Assert.assertEquals(expectedMap, expectedResults);

	}
}
