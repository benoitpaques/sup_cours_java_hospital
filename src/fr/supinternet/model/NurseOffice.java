package fr.supinternet.model;

import java.util.ArrayList;
import java.util.List;

public class NurseOffice{
	
	private List<Nurse> nurses = new ArrayList<Nurse>();
	
	public boolean addNurse(Nurse nurse){
		if (nurse == null){
			return false;
		}
		if (nurses == null){
			return false;
		}
		
		return nurses.add(nurse);
	}
	
	public boolean removeNurse(Nurse nurse){
		if (nurse == null){
			return false;
		}
		if (nurses == null){
			return false;
		}
		
		return nurses.remove(nurse);
	}
	
}
