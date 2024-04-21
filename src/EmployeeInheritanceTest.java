/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */
import java.util.ArrayList;
import java.text.NumberFormat;

/**
 * The EmployeeInheritanceTest class is responsible for printing monthly payment slips for employees.
 */
public class EmployeeInheritanceTest {

    /**
     * Prints the monthly payment slip for the given employee.
     * 
     * @param employee The employee for whom the payment slip is to be printed.
     */
    public static void printMonthlyPaymentSlip(Employee employee) {
        NumberFormat nf = NumberFormat.getInstance();
        String[] name = employee.getFullName().split("-");

        if (employee instanceof HourlyEmployee) {
            HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
            System.out.println("*************************************************\n");
            System.out.printf("\tPayment Slip of %s\n\n", hourlyEmployee.getFullName().toUpperCase());
            System.out.println("*************************************************\n");
            System.out.printf("First Name : %s\tLast Name: %s\n", name[0], name[1]);
            System.out.printf("Department: %s\tAge: %d\n", hourlyEmployee.getDepartment(), hourlyEmployee.getAge());
            System.out.printf("Monthly Payment: %s baht\n\n\n", nf.format(hourlyEmployee.getMonthlyPayment()));
        } else if (employee instanceof PermanentEmployee) {
            PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
            System.out.println("*************************************************\n");
            System.out.printf("\tPayment Slip of %s\n\n", permanentEmployee.getFullName().toUpperCase());
            System.out.println("*************************************************\n");
            System.out.printf("First Name : %s\tLast Name: %s\n", name[0], name[1]);
            System.out.printf("Department: %s\t\tAge: %d\n", permanentEmployee.getDepartment(), permanentEmployee.getAge());
            System.out.printf("Monthly Payment: %s baht Social Security: %s baht\n\n\n",
            nf.format(permanentEmployee.getMonthlyPayment()),nf.format(permanentEmployee.getSocialSec()));
        }
    }

    /**
     * The main method creates a list of employees and prints their monthly payment slips.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<Employee>();

        PermanentEmployee employee1 = new PermanentEmployee();
        employee1.setEmployee("Somchai-Hankla", 25, "IT", 8, 20000);
        employee.add(employee1);

        PermanentEmployee employee2 = new PermanentEmployee();
        employee2.setEmployee("Somsong-Bunthum", 22, "IT", 4, 12000);
        employee.add(employee2);

        HourlyEmployee employee3 = new HourlyEmployee();
        employee3.setEmployee("Manee-Dumkum", 21, "Production", 25, 6);
        employee.add(employee3);

        HourlyEmployee employee4 = new HourlyEmployee();
        employee4.setEmployee("Piti-Rukthai", 25, "Production", 30, 5);
        employee.add(employee4);

        HourlyEmployee employee5 = new HourlyEmployee();
        employee5.setEmployee("Veera-Rukdee", 30, "Production", 20, 8);
        employee.add(employee5);

        for (Employee emp : employee) {
            printMonthlyPaymentSlip(emp);
        }
    }
}
