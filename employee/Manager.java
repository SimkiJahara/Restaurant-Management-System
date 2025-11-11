
package employee;

/**
 *
 * @author ummej
 */
class Manager extends Employee {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Manager(String employeeId, String name, double salary) {
        super(employeeId, name, salary);
    }

    // Additional Manager-specific methods can be added here
}
