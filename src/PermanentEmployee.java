/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */

/**
 * Represents a permanent employee.
 * Inherits from the Employee class.
 */
public class PermanentEmployee extends Employee {
    private double salary;
    private double socialSec;

    /**
     * Sets the employee's information.
     * @param setFullName The full name of the employee.
     * @param setAge The age of the employee.
     * @param setDepartment The department of the employee.
     * @param setPerformanceScore The performance score of the employee.
     * @param setSalary The salary of the employee.
     */
    public void setEmployee(String setFullName, int setAge, String setDepartment, int setPerformanceScore,int setSalary) {
        this.fullName = setFullName;
        this.department = setDepartment;
        this.age = setAge;
        this.performanceScore = setPerformanceScore;
        this.salary = setSalary;
    }

    /**
     * Gets the salary of the employee.
     * @param getSalary The salary of the employee.
     * @return The salary of the employee.
     */
    public double getSalary(double getSalary) {
        return this.salary;
    }

    /**
     * Calculates the monthly payment of the employee.
     * Takes into account the performance score and social security deductions.
     * @return The monthly payment of the employee.
     */
    public double getMonthlyPayment() {
        double salaryReturn = this.salary;
        if (this.performanceScore >= 8) {
            salaryReturn = salaryReturn * 1.03;
        }

        socialSec = salaryReturn * 0.05;
        if (socialSec <= 750) {
            salaryReturn = salaryReturn - socialSec;
            return salaryReturn;
        } else if (socialSec > 750) {
            socialSec = 750;
            salaryReturn = salaryReturn - socialSec;
            return salaryReturn;
        }
        return Double.NaN;
    }

    /**
     * Gets the social security deduction of the employee.
     * @return The social security deduction of the employee.
     */
    public double getSocialSec() {
        return this.socialSec;
    }
}
