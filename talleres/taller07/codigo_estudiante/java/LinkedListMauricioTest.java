import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListMauricioTest {

	@Test
	public void testInsert() {
		LinkedListMauricio list = new LinkedListMauricio();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		for (int i = 0; i < list.size(); i++)
		{
			assertEquals(list.get(0),1);
			assertEquals(list.get(1),2);
			assertEquals(list.get(2),3);
			assertEquals(list.get(3),4);
			assertEquals(list.get(4),5);			
		}		
	}

	@Test
	public void testRemove() {
		LinkedListMauricio list = new LinkedListMauricio();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		assertTrue(list.contains(3));
		list.remove(2);
		assertFalse(list.contains(3));
	}

	@Test
	public void testContains() {
		LinkedListMauricio list = new LinkedListMauricio();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		assertTrue(list.contains(3));
		assertFalse(list.contains(10));
	}

}
