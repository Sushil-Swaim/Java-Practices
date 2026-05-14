public class salary {
    public static void main(String[] args) {
        double basicPay     = 30000.0;  
        double hra          = 5000.0;   
        double ta           = 2000.0;   
        double pfDeduction  = 3600.0;   
        double taxDeduction = 2000.0;   
        double grossSalary = basicPay + hra + ta;
        double netSalary   = grossSalary - pfDeduction - taxDeduction;
        System.out.println("=== Salary Details ===");
        System.out.println("Basic Pay        : Rs. " + basicPay);
        System.out.println("HRA Allowance    : Rs. " + hra);
        System.out.println("TA  Allowance    : Rs. " + ta);
        System.out.println("Gross Salary     : Rs. " + grossSalary);
        System.out.println("PF  Deduction    : Rs. " + pfDeduction);
        System.out.println("Tax Deduction    : Rs. " + taxDeduction);
        System.out.println("Net Salary       : Rs. " + netSalary);
    }
}
