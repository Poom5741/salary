public class HourlyEmployee extends Empolyee {
    private int workingSessionsPerMonth, workingPerDay = 8;
    private static int  MIN_HOURLY_WAGE_RATE = 50;

    public double calculatePersonalHourlyWage() {
        double wageRate = 0;
        if (this.performanceScore < 5) {
            double wageRate = MIN_HOURLY_WAGE_RATE;
            return wageRate;
        } else if (this.performanceScore > 5) {
            double wageRate = ((this.performanceScore-5) * 0.5) + MIN_HOURLY_WAGE_RATE;
            return wageRate;
        }
    }

    public double getMonthlyPayment() {
        double result = this.calculatePersonalHourlyWage()*workingPerDay*workingSessionsPerMonth;
        return result;
    }
}
