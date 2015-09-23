package fr.supinternet.manager;

import java.util.ArrayList;

import fr.supinternet.model.Room;


public class AlarmManager {

	private static AlarmManager SINGLETON = null;

	/**
	 * The lock for thread safety.
	 */
	private static final Object __synchonizedObject = new Object();
	
	private ArrayList<OnAlarmListener> listeners = new ArrayList<OnAlarmListener>();

	public static AlarmManager getInstance() {
		if (SINGLETON == null) {
			synchronized (__synchonizedObject) {
				if (SINGLETON == null) {
					SINGLETON = new AlarmManager();
				}
			}
		}
		return SINGLETON;
	}

	private AlarmManager() {
		
	}
	
	public void addListener(OnAlarmListener listener){
		synchronized (listeners) {
			if (listener == null){
				return;
			}
			if (listeners == null){
				listeners = new ArrayList<OnAlarmListener>();
			}
			if (listeners.contains(listener)){
				return;
			}
			listeners.add(listener);
		}
	}
	
	public void removeListener(OnAlarmListener listener){
		if (listener == null){
			return;
		}
		if (listeners == null){
			return;
		}
		if (listeners.contains(listener)){
			listeners.remove(listener);
		}
	}
	
	public void notifyListener(Room r){
		if (listeners  != null){
			for (OnAlarmListener l : listeners){
				l.onAlarm(r);
			}
		}
	}

}
