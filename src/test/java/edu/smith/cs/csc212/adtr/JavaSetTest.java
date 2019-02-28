package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	//Tests if the size works
	@Test
	public void testSize() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		assertEquals(abc.size(), 3);
	}
	//Tests if inserting works
	@Test
	public void testInsert() {
		SetADT<String> a = new JavaSet<>();
		a.insert("a");
		a.insert("a");
		a.insert("a");
		assertEquals(a.size(), 1);
	}
	//Tests if contains works
	@Test
	public void testContains() {
		SetADT<String> containTest = new JavaSet<>();
		containTest.insert("a");
		containTest.insert("b");
		containTest.insert("c");
		assertTrue(containTest.contains("a"));
	}
	//Tests if value is removed
	@Test
	public void testRemove() {
		SetADT<String> removeTest = new JavaSet<>();
		removeTest.insert("a");
		removeTest.insert("b");
		removeTest.insert("c");
		removeTest.remove("a");
		assertFalse(removeTest.contains("a"));
	}
	//Tests if toList converts the set to a list
	@Test
	public void testToList() {
		SetADT<String> ToList = new JavaSet<>();
		ToList.insert("hi");
		assertEquals(ToList.toList().size(),1);
	}
	//Tests if the set could be converted into a map
	@Test
	public void testtoJava() {
		SetADT<String> checking = new JavaSet<>();
		assertEquals(checking.toJava().size(),0);
	}
}
