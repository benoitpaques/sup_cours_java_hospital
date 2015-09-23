package fr.supinternet.model;

import java.util.ArrayList;
import java.util.List;

import fr.supinternet.manager.OnAlarmListener;

public class NurseOffice implements OnAlarmListener{
	
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

	@Override
	public String toString() {
		return "NurseOffice [nurses=" + nurses + "]";
	}

	@Override
	public void onAlarm(Room r) {
		System.out.println("La chambre " + r + " a sonnée.");
	}
	
}
