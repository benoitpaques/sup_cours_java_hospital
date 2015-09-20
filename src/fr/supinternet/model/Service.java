package fr.supinternet.model;

import java.util.ArrayList;
import java.util.List;

public class Service {
	
	private List<Room> rooms = new ArrayList<Room>();
	
	private List<NurseOffice> nurseOffices = new ArrayList<NurseOffice>();
	
	public boolean addRoom(Room room){
		if (room == null){
			return false;
		}
		if (rooms == null){
			return false;
		}
		
		return rooms.add(room);
	}
	
	public boolean removeRoom(Room room){
		if (room == null){
			return false;
		}
		if (rooms == null){
			return false;
		}
		
		return rooms.remove(room);
	}
	
	public boolean addNurseOffice(NurseOffice nurseOffice){
		if (nurseOffice == null){
			return false;
		}
		if (nurseOffices == null){
			return false;
		}
		
		return nurseOffices.add(nurseOffice);
	}
	
	public boolean removeNurseOffice(NurseOffice nurseOffice){
		if (nurseOffice == null){
			return false;
		}
		if (nurseOffices == null){
			return false;
		}
		
		return nurseOffices.remove(nurseOffice);
	}

}
