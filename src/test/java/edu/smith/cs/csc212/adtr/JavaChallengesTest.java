package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.smith.cs.csc212.adtr.Challenges;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaChallengesTest {
	
	//Tests by making sure that the union method doesn't add repeated values into list
	@Test
	public void testUnion() {
		SetADT <Integer> left = new JavaSet<>();
		SetADT<Integer> right = new JavaSet<>();

		left.insert(1);
		right.insert(2);
		left.insert(2);
		right.insert(3);
		assertEquals(Challenges.union(left,right).size(),3);
		
	}
	//Tests by making sure that the union method adds only repeated values into list
	@Test
	public void testIntersection() {
		SetADT <Integer> left = new JavaSet<>();
		SetADT<Integer> right = new JavaSet<>();

		left.insert(1);
		right.insert(2);
		left.insert(2);
		left.insert(3);
		right.insert(4);
		
		assertEquals(Challenges.intersection(left,right).size(),1);
	}	
}