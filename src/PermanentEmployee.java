public class PermanentEmployee extends Employee {
    private double salary;
    private double socialSec;

    public void setEmployee(String setFullName, int setAge, String setDepartment, int setPerformanceScore,int setSalary) {
        this.fullName = setFullName;
        this.department = setDepartment;
        this.age = setAge;
        this.performanceScore = setPerformanceScore;
        this.salary = setSalary;
    }
    public double getSalary(double getSalary) {
        return this.salary;
    }

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

    public double getSocialSec() {
        return this.socialSec;
    }
}
