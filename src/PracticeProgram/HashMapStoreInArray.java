package PracticeProgram;

import java.util.*;

public class HashMapStoreInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 8, 9, 0,100,101,102,104 };

		Map<Integer, Integer> hm = new HashMap<>();

		for (int b : a) {

			if (hm.containsKey(b)) {

			} else {
				hm.put(b, 1);
			}

		}
		
		System.out.println(hm);

	}

}
