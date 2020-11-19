package com.cg.healthassist;

import com.cg.healthassist.daoimpl.MedicalStoreDAOImpl;
import com.cg.healthassist.daoimpl.PatientDAOImpl;
import com.cg.healthassist.model.MedicalStore;
import com.cg.healthassist.model.Medicine;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger; 
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.info("My Logger");
    	Medicine m1 = new Medicine("Crocin",120,"Mankind","12/12/2021","23/08/2020");
		Medicine m2 = new Medicine("Dispirin",80,"Cipla","01/01/2022","15/07/2020");
		
		List<Medicine> medicineList = new ArrayList<>();
		medicineList.add(m1);
		medicineList.add(m2);
		
		MedicalStore medicalStore = new MedicalStore("Avon",9811123456L,"XYZ",medicineList,"Shubham");
		MedicalStoreDAOImpl obj = new MedicalStoreDAOImpl();
		obj.persist(medicalStore);
        
    }
}
