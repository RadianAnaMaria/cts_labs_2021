package ro.ase.csie.g1088.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
	static ArrayList<Integer> noteRandom;

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
		
		
		@Test void testGetMediePerformance() {
			ArrayList<Integer>note=new ArrayList<>();
			int nrNote=(int) 1e6;
			Random random=new Random();
			for(int i=0; i<nrNote;i++) {
				note.add(random.nextInt(Student.MAX_NOTA)+1);
				
			}
			student.setNote(note);
			long tStart=System.currentTimeMillis();
			student.getMedie();
			long tFinal=System.currentTimeMillis();
			
			long durata=tFinal-tStart;
			if(durata<=10) {
				assertTrue(true);
				
			}
			else {
				fail("Calculul mediei dureaza mai mult de 10 milisecunde");
			}
			
			}
		
		@Test
		public void testSetVarstaInverse() {
			int varstaNoua = 22;
			student.setVarsta(varstaNoua);
			assertNotEquals("Set nu modifica valoarea atributului", varstaInitiala, student.getVarsta());
			
		}
		
		@Test
		public void setGetNotaMinima() {
			ArrayList<Integer> note=new ArrayList<>();
			Random random=new Random();
			note.add(random.nextInt(Student.MAX_NOTA)+1);
			note.add(random.nextInt(Student.MAX_NOTA)+1);
			note.add(random.nextInt(Student.MAX_NOTA)+1);
			
			student.setNote(note);
			
			int notaMinima=student.getNotaMinima();
			
			for(int i=0;i<student.getNrNote(),i++) {
				if(notaMinima> student.getNota(i))
				{
					fail("Minimul nu e caluclat corect");}
				}
			assertTrue(true);

			

			
		}
}
