public class method236_no11 {
    public static void main(String[] args) {

        System.out.println("Sales Amount \t Comission");
        System.out.println("--------------------------");
        for(double salesAmount=10000; salesAmount<=100000; salesAmount+=5000){
            System.out.printf("%.0f \t\t", salesAmount);
            System.out.printf("   %.1f \n", computeComission(salesAmount));
        }
    }

    public static double computeComission(double salesAmount){

        double balance = 0.0, comission = 0.0;
        
        if(salesAmount >= 10000.01)
            comission += (balance = salesAmount - 10000) * 0.12;
        
        if(salesAmount >= 5000.01)
            comission += (balance -= balance - 5000) * 0.10;
        
        if(salesAmount >= 0.01)
            comission += balance * 0.08;
        
        return comission;
    }
}
