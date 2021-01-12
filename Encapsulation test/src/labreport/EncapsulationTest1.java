package labreport;

public class EncapsulationTest1 {
	private String studentName;
	private String idNumber;
	private int studentAge;
	
	public String getName() {
		return studentName;
	}
	public void setName(String studentname) {
		this.studentName = studentname;
	}
	public String getidNumber() {
		return idNumber;
	}
	public void setidNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public int getstudentAge() {
		return studentAge;
	}
	public void setstudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
