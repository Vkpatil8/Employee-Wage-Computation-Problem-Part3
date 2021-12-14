public class UseCase5 {
    int UseCase5(){
        UseCase4 useCase4 = new UseCase4();
        int totalEmpHours = useCase4.UseCase4();
        return totalEmpHours * 20 ;
    }
}