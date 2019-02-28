package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {

	void assertIntEq(int x, int y) {
		assertEquals(x,y);
	}
	
	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	//Tests if the keys,values are put into the map
	@Test
	public void testPut() {
		MapADT<String, Integer> putFruit = new JavaMap<>();
		putFruit.put("apple", 0);
		putFruit.put("orange", 1);
		putFruit.put("mango", 2);
		putFruit.put("apple", 4);
		assertEquals(putFruit.size(), 3);
	}
	//Tests if the keys,values are in the map
	@Test
	public void testGet() {
		MapADT<String, Integer> getFruit = new JavaMap<>();
		getFruit.get("apple");
		getFruit.get("orange");
		getFruit.get("mango");
		getFruit.get("apple");
		assertEquals(getFruit.get("apple"),null);
	}
	//Tests if the keys,values size are correctly in the map
	@Test
	public void testSize() {
		MapADT<String, Integer> sizeFruit = new JavaMap<>();
		sizeFruit.put("apple", 0);
		sizeFruit.put("orange", 1);
		sizeFruit.put("mango", 2);
		sizeFruit.put("apple", 0);
		assertEquals(sizeFruit.size(), 3);
	}
	//Tests if the keys,values are removed from the map
	@Test
	public void testRemove() {
		MapADT<String, Integer> fruit = new JavaMap<>();
		fruit.put("apple", 0);
		fruit.put("orange", 1);
		fruit.put("mango", 2);
		fruit.put("apple", 0);
		fruit.remove("apple");
		assertEquals(fruit.size(), 2);
	}
	//Tests if the keys are put in the map
	@Test
	public void testgetKeys() {
		MapADT<String, Integer> fruit = new JavaMap<>();
		fruit.put("apple", 0);
		fruit.put("orange", 1);
		fruit.put("mango", 2);
		fruit.put("apple", 0);
		fruit.remove("apple");
		assertEquals(fruit.getKeys().size(),2);
	}
	//Tests if the keys,values are in the map
	@Test
	public void testgetEntries() {
		MapADT<String, Integer> fruit = new JavaMap<>();
		fruit.put("apple", 0);
		fruit.put("orange", 1);
		fruit.put("mango", 2);
		fruit.put("apple", 0);
		fruit.remove("apple");
		assertEquals(fruit.getEntries().size(),2);
	}
	//Test if Map could be made into a java data structure
	@Test
	public void testtoJava() {
		MapADT<String, Integer> fruit = new JavaMap<>();
		assertEquals(fruit.toJava().size(),0);
	}

}
