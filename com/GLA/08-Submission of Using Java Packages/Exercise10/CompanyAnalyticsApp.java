import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class CompanyAnalyticsApp {
    public static void main(String[] args) {
        System.out.println("===== Exercise 10 =====\n");

        SalesReport sr = new SalesReport();
        EmployeeReport er = new EmployeeReport();

        sr.print();
        System.out.println();

        er.print();
        System.out.println();

        System.out.println("=== SUMMARY ===");
        System.out.println("Total Sales: " + sr.getTotal());
        System.out.println("Top Region: " + sr.getTop());
        System.out.println("Total Employees: " + er.getTotal());
        System.out.println("Largest Dept: " + er.getLargest());
    }
}
