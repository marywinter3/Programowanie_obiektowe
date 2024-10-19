import java.lang.StringBuilder;

/**
 * Represents bank employee.
 * Each employee has unique id.
 */
public class BankEmployee {
    String name;
    String position;
    String[] skills;
    static int id = 0;

    /**
     * Constructor setting default values.
     */
    public BankEmployee() {
        this.name = "";
        this.position = "";
        this.skills = new String[0];
        id += 1;
    }

    /**
     * Constructor
     * @param name Name of an employee.
     * @param position Position of an employee.
     */
    public BankEmployee(String name, String position) {
        this.name = name;
        this.position = position;
        this.skills = new String[0];
        id += 1;
    }

    /**
     * Constructor
     * @param name Name of an employee.
     * @param position Position of an employee.
     * @param skills Skills of an employee.
     */
    public BankEmployee(String name, String position, String[] skills) {
        this.name = name;
        this.position = position;
        this.skills = skills;
        id += 1;
    }

    /**
     * Sets skills of en employee.
     * @param skills Skills of an employee.
     */
    void setSkills(String[] skills) {
        this.skills = skills;
    }


    /**
     *
     * @return Returns information about an employee as a String.
     */
    public String toString() {
        StringBuilder str1 = new StringBuilder("Name: " + this.name + "\nPosition: " + this.position + "\nSkills: ");
        for(String skill : this.skills) {
            str1.append(skill + " ");
        }
        str1.append("\nID: " + this.id + "\n");
        return str1.toString();
    }

}
