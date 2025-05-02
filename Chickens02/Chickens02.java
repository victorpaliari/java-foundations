public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

        int ovosRecolhidos = 100;
        int ovosRecolhidosTer = 121;
        int ovosRecolhidosQua = 117;
        double profitPerEgg = 0.18;

        double dailyAverage = (ovosRecolhidos + ovosRecolhidosTer + ovosRecolhidosQua) / 3.0;

        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * profitPerEgg;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
