package fr.supinternet.main;

import java.util.ArrayList;
import java.util.List;

import fr.supinternet.manager.AlarmManager;
import fr.supinternet.model.Nurse;
import fr.supinternet.model.NurseOffice;
import fr.supinternet.model.Patient;
import fr.supinternet.model.Room;
import fr.supinternet.model.Service;

public class Main {
	
	// benoit.paques@gmail.com
	
	// Alt + Shif + S création getter/setter
	// Ctrl + Maj + O Import automatique
	// Alt + Maj + R Renommage d'une variable
	// Alt + Maj + o  Création d'un constructeur prenant des champs

	public static void main(String[] args) {
		Service service = createFakeData();
		System.out.print(service);
		
		AlarmManager manager = AlarmManager.getInstance();
		manager.addListener(service.getNurseOffices().get(0));
	}
	
	private static Service createFakeData(){
		Service service = new Service();
		
		List<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient("Titi", "Rhume"));
		patients.add(new Patient("Toto", "Appendicite"));
		patients.add(new Patient("Tata", "Angine"));
		patients.add(new Patient("Robert", "Migraine"));
		patients.add(new Patient("Thomas", "Mononucléose"));
		
		List<Nurse> nurses = new ArrayList<Nurse>();
		nurses.add(new Nurse("Robert", "Bob", "day"));
		nurses.add(new Nurse("Norbert", "Noob", "night"));
		nurses.add(new Nurse("Herbert", "Toto", "day"));
		
		List<Room> rooms = new ArrayList<Room>();
		rooms.add(new Room("Edelweiss", 0, 5));
		rooms.add(new Room("Marguerite", 0, 5));
		
		NurseOffice nurseOffice = new NurseOffice();
		
		for (Room r : rooms){
			if (rooms.indexOf(r) == 0){
				for (int i = 0 ; i < 3 ; i++){
					r.addPatient(patients.get(i));
				}
			}else{
				for (int i = 2 ; i < patients.size() ; i++){
					r.addPatient(patients.get(i));
				}
			}
			service.addRoom(r);
		}
		
		for (Nurse n : nurses){
			nurseOffice.addNurse(n);
		}
		
		service.addNurseOffice(nurseOffice);
		
		return service;
	}

}
