/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */

/**
 * The HourlyEmployee class represents an employee who is paid on an hourly basis.
 * It extends the Employee class and includes methods to calculate the personal hourly wage
 * and the monthly payment.
 */
public class HourlyEmployee extends Employee {
    private int workingSessionsPerMonth, workingPerDay = 8;
    private static int MIN_HOURLY_WAGE_RATE = 50;

    /**
     * Sets the employee's information.
     * 
     * @param setFullName The full name of the employee.
     * @param setAge The age of the employee.
     * @param setDepartment The department of the employee.
     * @param setWorkingSession The number of working sessions per month.
     * @param setPerformanceScore The performance score of the employee.
     */
    public void setEmployee(String setFullName, int setAge, String setDepartment, int setWorkingSession,int setPerformanceScore) {
        this.fullName = setFullName;
        this.department = setDepartment;
        this.age = setAge;
        this.performanceScore = setPerformanceScore;
        this.workingSessionsPerMonth = setWorkingSession;
    }

    /**
     * Calculates the personal hourly wage based on the performance score.
     * 
     * @return The personal hourly wage.
     */
    public double calculatePersonalHourlyWage() {
        double wageRate = 0;
        if (this.performanceScore <= 5) {
            wageRate = MIN_HOURLY_WAGE_RATE;
            return wageRate;
        } else if (this.performanceScore > 5) {
            wageRate = ((this.performanceScore - 5) * 0.5) + MIN_HOURLY_WAGE_RATE;
            return wageRate;
        }
        return Double.NaN;
    }

    /**
     * Calculates the monthly payment based on the personal hourly wage, working hours per day,
     * and working sessions per month.
     * 
     * @return The monthly payment.
     */
    public double getMonthlyPayment() {
        double result = this.calculatePersonalHourlyWage() * workingPerDay * workingSessionsPerMonth;
        return result;
    }
}
