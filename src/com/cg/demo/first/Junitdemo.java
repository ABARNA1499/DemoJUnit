package com.cg.demo.first;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;
import static org.junit.Assert.*;


class Junitdemo {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public class  TestPerson2 
	{
		@Test
		public void testGetFullName()
		{
			System.out.println("from TestPerson2");
			Person per = new Person("Robert","King");
			assertEquals("Robert King",per.getFullName());
		}
		
		@Test 
		(expected =IllegalArgumentException.class)
		public void testNullsInName()
			{
			System.out.println("from TestPerson2 testing exceptions");
			Person per1 = new Person(null,null);		
			}
	}


}
