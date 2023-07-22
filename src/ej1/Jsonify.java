package ej1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jsonify {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
								
		
		if(entrada.hasNext()) {
			String[] y = args;
			System.out.println("{data:" + Arrays.toString(y) + "}");
		}
		
	}

	

}
