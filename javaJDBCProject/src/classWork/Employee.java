package classWork;

public class Employee {

	private int employeeId;
	String firstName;
	String lastName;
	String phone;

	public Employee(int id, String firstName, String lastName, String phone) {
		super();
		this.employeeId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return employeeId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.employeeId = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void printEmployee() {
		System.out.println(" ");
		System.out.println("Employee ID : " + this.employeeId);
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Phone : " + this.phone);
	}

}
