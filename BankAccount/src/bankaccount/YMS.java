
package bankaccount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YMS extends Client {

	// static objects for IO processing //
 
	static ArrayList<List<String>> alist = new ArrayList<>(); // array list to hold row data

	public void readData() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File("data.csv")));
			String line;
			while ((line = br.readLine()) != null) {
				alist.add(Arrays.asList(line.split(",")));
				System.out.println(alist);
			}
		} catch (Exception e) {
			System.out.println("There was a problem loading the file");
		}
		processData();

	}

	public void processData() {
		// TODO Auto-generated method stub

		printData();

	}

	public void printData() {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {

		YMS obj = new YMS();
		obj.readData();
	}

}
