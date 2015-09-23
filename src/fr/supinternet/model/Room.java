package fr.supinternet.model;

import java.util.ArrayList;
import java.util.List;

import fr.supinternet.manager.AlarmManager;

public class Room {
	
	private String name;
	
	private int number;
	
	private int bedCount;
	
	private List<Patient> patients = new ArrayList<Patient>();
	
	private AlarmManager alarmManager = AlarmManager.getInstance();
	
	public Room(String name, int number, int bedCount) {
		super();
		this.name = name;
		this.number = number;
		this.bedCount = bedCount;
		start();
	}
	
	private void start(){
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true){
					try {
						Thread.sleep((long) (Math.random() * 5000));
						alarmManager.notifyListener(Room.this);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}

	public boolean addPatient(Patient patient){
		if (patient == null){
			return false;
		}
		if (patients == null){
			return false;
		}
		
		return patients.add(patient);
	}
	
	public boolean removePatient(Patient patient){
		if (patient == null){
			return false;
		}
		if (patients == null){
			return false;
		}
		
		return patients.remove(patient);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBedCount() {
		return bedCount;
	}

	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bedCount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (bedCount != other.bedCount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", number=" + number + ", bedCount="
				+ bedCount + "]";
	}

}
