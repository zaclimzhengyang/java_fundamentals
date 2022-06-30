package arrayListVersusArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friendsArray = new String[4];
		// need to indicate size when declaring, size is immutable
		String[] friendsArray2 = {"John", "Chris", "Luke"};
		// capacity of this array is 3
		
		ArrayList<String> animalsArrayList = new ArrayList<String>();
		// arraylist does not have a fixed size
		ArrayList<String> animalsArrayList2 = new ArrayList<>(Arrays.asList("cats","dogs"));
		ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
		// arrays can hold primitives or objects
		// arraylist can only hold objects, cannot hold primitive, 
		// but supports wrapper types for primitives
		
		// get element
		System.out.println(friendsArray2[0]);
		System.out.println(animalsArrayList2.get(1));

		// get length
		System.out.println(friendsArray2.length);
		System.out.println(animalsArrayList2.size());
		
		// add element
		// cannot add an element to the end of the array due to it having a fixed size
		animalsArrayList2.add("cows");
		System.out.println(animalsArrayList2.get(2));
		System.out.println(animalsArrayList2.size());
		
		// replacing element
		friendsArray2[0] = "Carl";
		for(int i=0; i<friendsArray2.length; i++) {
			System.out.println(friendsArray2[i]);
		}
		animalsArrayList2.add(0, "alligator Jr");
		for(int j=0; j<animalsArrayList2.size(); j++) {
			System.out.println(animalsArrayList2.get(j));
		}
		
		// cannot remove elements from array
//		animalsArrayList2.remove(2);
		animalsArrayList2.remove("dogs");
		System.out.println(friendsArray2);
		System.out.println(animalsArrayList2);
		
		// convert array to arraylist
		Integer[] myIntArray2 = new Integer[4];
		List<Integer> myIntArrayList2 = Arrays.asList(myIntArray2);
		System.out.println(myIntArrayList2.getClass()); 
		
		// arraylist is a java wrapper for array, to make life easier
		// arraylist is a java collection
	}

}
