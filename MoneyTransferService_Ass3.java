public class MoneyTransferService_Ass3 {

    CurrencyConverter_Ass3 cc = new CurrencyConverter_Ass3();

    double computeTransferAmount(int countryIndex, double amount) {
            return cc.computeTransferAmount(countryIndex, amount);		
    }

    double computeTransferFee(int countryIndex, double amount) {
            double transferAmount = computeTransferAmount(countryIndex, amount);
            double transferFee = transferAmount * 0.02;
            return transferFee;
    }
    public static void main(String[] args) {
            MoneyTransferService_Ass3 transferService = new MoneyTransferService_Ass3();
    
            double transferAmount = transferService.computeTransferAmount(0, 1000);
            double transferFee = transferService.computeTransferFee(0, 1000);
    
            System.out.println("transferAmount: " + transferAmount);
            System.out.println("transferFee: " + transferFee);
    }

}
