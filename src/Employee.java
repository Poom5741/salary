/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */

/**
 * The Employee class represents an employee in a company.
 * It contains information about the employee's full name, department, age, and performance score.
 */
public class Employee {
    protected String fullName;
    protected String department;
    protected int age;
    protected int performanceScore;

    /**
     * Sets the employee's information.
     * @param setFullName The full name of the employee.
     * @param setAge The age of the employee.
     * @param setDepartment The department of the employee.
     * @param setPerformanceScore The performance score of the employee.
     */
    public void setEmployee(String setFullName, int setAge, String setDepartment, int setPerformanceScore) {
        this.fullName = setFullName;
        this.department = setDepartment;
        this.age = setAge;
        this.performanceScore = setPerformanceScore;
    }

    /**
     * Returns the full name of the employee.
     * @return The full name of the employee.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Returns the department of the employee.
     * @return The department of the employee.
     */
    public String getDepartment() {
        return this.department;
    }
    
    /**
     * Returns the age of the employee.
     * @return The age of the employee.
     */
    public int getAge() {
        return this.age;
    }

}