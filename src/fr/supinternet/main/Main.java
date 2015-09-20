package fr.supinternet.main;

import java.util.ArrayList;
import java.util.List;

import fr.supinternet.model.Nurse;
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
	}
	
	private static Service createFakeData(){
		Service service = new Service();
		
		List<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient("Robert", "Rhume"));
		patients.add(new Patient("Robert", "Rhume"));
		patients.add(new Patient("Robert", "Rhume"));
		patients.add(new Patient("Robert", "Rhume"));
		patients.add(new Patient("Robert", "Rhume"));
		patients.add(new Patient("Robert", "Rhume"));
		patients.add(new Patient("Robert", "Rhume"));
		
		List<Nurse> nurses = new ArrayList<Nurse>();
		nurses.add(new Nurse("Robert", "Bob", "day"));
		
		Room room = new Room("Edelweiss", 0, 5);
		room.addPatient(patients.get(0));
		
		return service;
	}

}
