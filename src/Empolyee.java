/**
 * Empolyee
 */
public class Empolyee {
    private String fullName, department;
    private int age;
    protected int performanceScore;

    public void setEmployee(String setFullName, String setDepartment, int setAge, int setPerformanceScore) {
        this.fullName = setFullName;
        this.department = setDepartment;
        this.age = setAge;
        this.performanceScore = setPerformanceScore;
    }

}