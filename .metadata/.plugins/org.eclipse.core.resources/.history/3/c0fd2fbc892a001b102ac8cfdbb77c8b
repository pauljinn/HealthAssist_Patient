package com.cg.healthassist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.healthassist.daoimpl.MedicalStoreDAOImpl;
import com.cg.healthassist.model.MedicalStore;
import com.cg.healthassist.model.Medicine;

public class MedicalStoreDAOImplTest {
	/**
	 * Instance of an implemented medical store dao.
	 */
	private static MedicalStoreDAOImpl medicalStoreDao;
	
	
	/**
	 * Run once before running any test cases and create a new instance of patient dao.
	 */
	@BeforeClass
	public static void runOnce() {
		medicalStoreDao = new MedicalStoreDAOImpl();
	}
	
	/**
	 * Test the persist functionality of patient dao whether it saving the patient inside the database or not.
	 */
	@Test
	public void test_Persist_GivenPatient() {
		Medicine m1 = new Medicine("Crocin",120,"Mankind","12/12/2021","23/08/2020");
		Medicine m2 = new Medicine("Dispirin",80,"Cipla","01/01/2022","15/07/2020");
		
		List<Medicine> medicineList = new ArrayList<>();
		medicineList.add(m1);
		medicineList.add(m2);
		
		MedicalStore medicalStore = new MedicalStore("Avon",9811123456L,"XYZ",medicineList,"Shubham");
		//System.out.println(medicalStore);
		medicalStoreDao.persist(medicalStore);
		//MedicalStore medicalStoreFound = medicalStoreDao.findByMedicalStoreId(medicalStore.getMedicalStoreId());
		//assertEquals(medicalStore.getMedicalStoreName(),medicalStoreFound.getMedicalStoreName());
	}
}
