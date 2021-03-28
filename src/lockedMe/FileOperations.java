package lockedMe;

import java.io.File;
import java.io.IOException;

class FileSearch {
	
	public void AddFile()throws IOException{
	
	File fileAdd=new File("C://MDM//FSD//FSD_Java//FSD_Project_PhaseOne//src//File1.txt");
	boolean Status =fileAdd.createNewFile();
	if(Status) {
		System.out.println("File has been added successfully");
	}
	else 
		 {
				System.out.println("File has already present in the Location");
			}
	}
}


public class FileOperations {
	
	public static void main(String[] args) throws IOException {
		FileSearch File1= new FileSearch();
		File1.AddFile();
	}

}
