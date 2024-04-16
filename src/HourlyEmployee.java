public class HourlyEmployee extends Employee {
    private int workingSessionsPerMonth, workingPerDay = 8;
    private static int MIN_HOURLY_WAGE_RATE = 50;

    public void setEmployee(String setFullName, int setAge, String setDepartment, int setWorkingSession,int setPerformanceScore) {
        this.fullName = setFullName;
        this.department = setDepartment;
        this.age = setAge;
        this.performanceScore = setPerformanceScore;
        this.workingSessionsPerMonth = setWorkingSession;
    }

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

    public double getMonthlyPayment() {
        double result = this.calculatePersonalHourlyWage() * workingPerDay * workingSessionsPerMonth;
        return result;
    }
}
