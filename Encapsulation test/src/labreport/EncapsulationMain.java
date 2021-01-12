package labreport;

public class EncapsulationMain {
	public static void main(String args[]) {

		EncapsulationTest1 encap = new EncapsulationTest1();

		encap.setName("Shah Md. Iktakhairul Islam");
		encap.setidNumber("171-15-8606");
		encap.setstudentAge(21);

		System.out.println("Name: " + encap.getName() + "\n" + "Id Number: " + encap.getidNumber() + "\n" + "Age: " + encap.getstudentAge());

	}

}
