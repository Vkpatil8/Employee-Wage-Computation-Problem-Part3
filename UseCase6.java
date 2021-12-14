class UseCase6 {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        UseCase5 empWageBuilder = new UseCase5();
        int totalEmpWage = empWageBuilder.UseCase5();
        System.out.println("Total Emp Wage for company is " + totalEmpWage);
    }
}
