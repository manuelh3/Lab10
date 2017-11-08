/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * The name of the employee.
     */
    private String name;
    /**
     * The name of this employee's supervisor.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newName of employee.
     * @param newManager employee's supervisor.
     */
    public Employee(final String newName, final String newManager) {
        this.name = newName;
        this.manager = newManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newName bet.
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newManager bet.
     */
    public void setManager(final String newManager) {
        this.manager = newManager;
    }
}
