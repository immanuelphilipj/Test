package screenshot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BasicException {
	
	static void runMe(int a) throws TestMouseHover{
		
		if(a==16)
			throw new TestMouseHover("Not eligible, not greater than 10");
		else if(a==17)
			throw new TestMouseHover();
		else
			System.out.println("Eligible for license");
	}
	
	public static void main(String[] args) throws Exception{
		try{
			String line =null;
		runMe(16);
			
			
/*				FileWriter file = new FileWriter("c:\\Chrome\\Data1.txt");
				 file.write("Guru99123");
				 file.close();
				 
				 
				File filereader = new File("c:\\Chrome\\Data1.txt");
				  FileReader fr = new FileReader(filereader);
	            BufferedReader bufferedReader = new BufferedReader(fr);
	                while((line = bufferedReader.readLine()) != null) {
	                    System.out.println(line);
	                }   

	                // Always close files.
	                bufferedReader.close(); 
*/		      
		}catch(Exception e){
			//System.out.println(e.getMessage());
		}
	}

}
