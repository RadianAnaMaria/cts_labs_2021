package ro.ase.csie.g1088.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudentAlteTeste {
	
	static Student student;
	static ArrayList<Integer> noteInitiale;
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		numeInitial="Gigel";
		varstaInitiala=Student.MIN_VARSTA+1;
		nrNoteInitiale=3;
		for(int i=0; i<nrNoteInitiale; i++) {
			noteInitiale.add(Student.MAX_NOTA-i);
			
			
		}
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial, varstaInitiala, noteInitiale);
	}

	@After
	public void tearDown() throws Exception {
		student=null;
	}

	@Test
	public void testSetVarstRangeMinValue() {
		int varstaNoua=Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test
	public void SetVarstaBoundaryLimitaInferioara() throws ExceptieVarsta {
		int VarstaNoua=Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("Test pt varsta minima", varstaNoua, varstaStudent);
	}
	
	@Test
	public void testSetNoteReferenceShallowCopy() throws ExceptieNota {
		int noteStudent[] = new int[] {9,9,10};
		ArrayList<Integer> refNote= new ArrayList<>(Arrays.asList(9,9,10));
		
		student.setNote(refNote);
		
		refNota.set(0, 5);
		
		int noteExistente[]=new int[student.getNrNote()];
		for(int i=0;i<student.getNrNote());i++) {
			noteExistente[i]=student.getNota(i);
		}

}
