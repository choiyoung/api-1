package api.util.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/*
 * java.util.Arrays  의 메소드인 
 * Sort() 는 정렬 기능을 한다. 
 * */
public class SortDemo {
	Vector<Integer> vec = new Vector<Integer>();

	public Vector<Integer> getAscSort1(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i : arr) {
			vec.addElement(i);
		}
		return vec;
	}

	public Vector<Integer> getAscSort2(int[] arr) {
		Arrays.sort(arr);
		for (int i : arr) {
			vec.addElement(i);
		}
		return vec;
	}
	public static void main(String[] args) {
		SortDemo util = new SortDemo();
		SortDemo util2= new SortDemo();
		java.util.List<Integer> list1= new ArrayList<Integer>();
		java.util.List<Integer> list2= new ArrayList<Integer>();
		int[] arr ={8,5,9,4,7,0};
		list1=util.getAscSort1(arr);
		list2=util2.getAscSort2(arr);
		System.out.println(""+list1.toString());
		System.out.println(""+list2.toString());
	}
}
