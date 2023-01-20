class CurrencyConverter_Ass2{
	
	double[] exchangeRates=new double[] {63,3,3,595,18,107,2};
	
	void printCurrency(){
		System.out.println("rupee: "+ exchangeRates[0]);
		System.out.println("dirham: "+ exchangeRates[1]);
		System.out.println("real: "+ exchangeRates[2]);
		System.out.println("chilean_peso: "+ exchangeRates[3]);
		System.out.println("mexican_peso: "+ exchangeRates[4]);
		System.out.println("_yen: "+ exchangeRates[5]);
		System.out.println("$australian: "+ exchangeRates[exchangeRates.length-1]);
	}
	
	public static void main(String[] args){
		CurrencyConverter_Ass2 a = new CurrencyConverter_Ass2();
		a.printCurrency();
	}
}