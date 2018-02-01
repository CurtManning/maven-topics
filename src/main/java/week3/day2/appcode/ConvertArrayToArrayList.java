package week3.day2.appcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "Ajeet", "Ahmed", "Ali", "Tom" };

		ArrayList<String> result = convertArrayToArrayList(array);
		System.out.println(result);
		String[] strArray = convertArrayToArrayList1();
		System.out.println(Arrays.toString(strArray));

	}

	public static ArrayList<String> convertArrayToArrayList(String[] asset) {
		ArrayList<String> newAssetList = new ArrayList<String>();
		for (String s : asset) {
			newAssetList.add(s);
		}
		Arrays.asList(asset);
		newAssetList.addAll(Arrays.asList(asset));
		
		return newAssetList;

	}

	public static String[] convertArrayToArrayList1() {
		ArrayList<String> assetTradingList = new ArrayList<String>();
		assetTradingList.add("Stock trading");
		assetTradingList.add("Futures and option trading");
		assetTradingList.add("electronic trading");
		assetTradingList.add("gold trading");
		assetTradingList.add("fixed incom bond trading");
		String[] assetTradingArray = new String[assetTradingList.size()];
		String[] strArray = assetTradingList.toArray(assetTradingArray);

		return strArray;

	}

}
