package cmplier_mp1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator calculator = new SimpleCalculator(null, //lexical analyzer
				                                           null); //syntax analyzer
		
		//txt file must be on 'files' folder.
		calculator.acceptInput("input.txt");
		calculator.solve();
		//calculator.printResults();
	}
	


}
