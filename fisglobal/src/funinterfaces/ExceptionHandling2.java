package funinterfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling2 {
	public static void main(String args[]){
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		try {
			br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
