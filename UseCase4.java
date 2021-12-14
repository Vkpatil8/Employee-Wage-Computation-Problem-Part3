class UseCase4 {
    int UseCase4 () {
        int totalWorkingDay = 1;
        int totalEmpHours = 0;
        int regularity = 0;

        int day = 1;
        while (totalWorkingDay <= 20 && totalEmpHours < 100 && day <=30) {
            UseCase3 useCase3 = new UseCase3();
            int empHours = useCase3.UseCase3();
            if (empHours > 0){
                System.out.println("Day " + day +" Working day " + totalWorkingDay + " and Work of Employee Hours is : " + empHours);

                totalWorkingDay++;
                totalEmpHours += empHours;
            }
            else {
                System.out.println("Day " + day + " Employee is absent");
                regularity ++;
            }
            day ++;
        }
        System.out.println("Total Emp Hours is " + totalEmpHours);
        if (regularity > 10 && totalEmpHours < 100 ){
            System.out.println("This Emp is not regular & he absent more than " + regularity + " days");
        }
        return totalEmpHours ;
    }
}
