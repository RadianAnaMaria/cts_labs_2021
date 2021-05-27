package ro.ase.csie.g1088.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetVarstConformanceRight()
	{
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(7);
		note.add(10);

		Student student = new Student("Gigel", 21, note);
		
		int varstaNoua=23;
		student.setVarsta(varstaNoua);
		
		assertEquals("Test cu valori corecte", varstaNoua, student.getVarsta());
		
	}

}
