package fr.supinternet.model;

public class Patient extends Person {
	
	private String diseaseName;
	
	public Patient(String name, String diseaseName) {
		super(name);
		this.diseaseName = diseaseName;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((diseaseName == null) ? 0 : diseaseName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (diseaseName == null) {
			if (other.diseaseName != null)
				return false;
		} else if (!diseaseName.equals(other.diseaseName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [diseaseName=" + diseaseName + "]";
	}

}
