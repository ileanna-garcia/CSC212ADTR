package edu.smith.cs.csc212.adtr;


import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {

	/**
	 * This method takes in two list and makes sure that a third list 
	 * output contains the object they do not have in common 
	 * @param left
	 * @param right
	 * @return
	 */
	
	// The union of two sets is the set of elements that either contains.
	public static SetADT<Integer> union (SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		
		/**If the object isn't in left or right then it's an union 
		Sets are converted into lists so it could run through the list 
		and search if the object of one list isn't the same as the other then it's added to output
		**/
		
		ListADT <Integer>leftList = left.toList();
		ListADT <Integer> rightList = right.toList();
	
		for(int i = 0 ; i < left.size(); i++ ) {
			if(!output.contains(leftList.getIndex(i) ) ) {
				output.insert(leftList.getIndex(i));
			}
			
		for(int k = 0 ; k < right.size(); k++ ) {
			if(!output.contains(rightList.getIndex(k) ) ) {
				output.insert(rightList.getIndex(k));
				}
		}
		
		
		}
		return output;
	}
	
	
	/**
	 * This method takes in two list and makes sure that a third list 
	 * output contains the object they do have in common 
	 * @param left
	 * @param right
	 * @return
	 */
	// The intersection of two sets is the set of elements that both contain.
	public static SetADT<Integer> intersection(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		
		/**If the object is in left and right then it's an intersection 
		Sets are converted into lists so it could run through the list 
		and search if the object of one list is the same as the other then it's added to output
		**/
		
		ListADT <Integer>leftList = left.toList();
		ListADT <Integer> rightList = right.toList();
		
		for(int i = 0 ; i < left.size(); i++ ) {
			for(int k = 0 ; k < right.size(); k++ ) {
				if(rightList.getIndex(k)==leftList.getIndex(i)) {
					output.insert(rightList.getIndex(k));
				}
			}
		}
		
		return output;
	}
	
	
	/**
	 * This method takes in the list words and converts the object and value of the object 
	 * into a map using the object as a key and the value as the object's index
	 * @param words
	 * @return
	 */
	
	// Count the words in the input list and put them in the map.
	public static MapADT<String, Integer> wordCount (ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		/**The list is looped through then the value and the index of 
		 * the value are added to the map as the key and value
		 **/
		for (int i = 0; i < words.size() ; i ++) {
			output.put(words.getIndex(i), i);
		}
		return output;
	}
	
	
	
}
