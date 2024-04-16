import java.util.ArrayList;

public class EmployeeInheritanceTest {

    public static void printMonthlyPaymentSlip(Employee employee) {
        String[] name = employee.getFullName().split("-");

        if (employee instanceof HourlyEmployee) {

            System.out.println("*************************************************");
            System.out.printf("\tPayment Slip of %s\n", employee.getFullName().toUpperCase());
            System.out.println("*************************************************");
            System.out.printf("First Name : %s\tLast Name: %s\n", name[0], name[1]);
            System.out.printf("Department: %s\tAge: %d\n", employee.getDepartment(), employee.getAge());
            System.out.printf("Monthly Payment: %d baht\n", ((HourlyEmployee) employee).getMonthlyPayment());
        } else if (employee instanceof PermanentEmployee) {

            System.out.println("*************************************************");
            System.out.printf("\tPayment Slip of %s\n", employee.getFullName().toUpperCase());
            System.out.println("*************************************************");
            System.out.printf("First Name : %s\tLast Name: %s\n", name[0], name[1]);
            System.out.printf("Department: %s\tAge: %d\n", employee.getDepartment(), employee.getAge());
            System.out.printf("Monthly Payment: %d baht\tSocial Security: %d baht\n",
                    ((PermanentEmployee) employee).getMonthlyPayment(),
                    ((PermanentEmployee) employee).getSocialSec());
        }
    }

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

        printMonthlyPaymentSlip(employee.get(3));
    }
}
