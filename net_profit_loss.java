public class net_profit_loss {
    public static void main(String[]args){
        int p1 = 1000;
        int p2 = 1000;
        float change1 = p1*90/100;
        float change2 = p2*120/100;
        float net_profit_percent = ((change1+change2)/(p1+p2)-1)*100;
        float net_profit = (change1+change2)-(p1+p2);
        System.out.println("net profit% = " + net_profit_percent + "%");   
        System.out.println("net profit = " + net_profit + " rupees");
    }
}