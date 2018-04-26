
import java.io.File;
import java.util.*;
import java.io.*;
import java.util.*;

import java.io.FileReader;
public class Prova {
	private void format1() {
		String s = new String("ws  ");
		boolean flag = false;
		int n_par = 0;
		int i = 0, fine = 0;
		while(i < s.length() && !flag) {
			if(s.charAt(i) == ' ') {
				while(i < s.length() && s.charAt(i) == ' ')
					i++;
				if(n_par != 0)
					flag = true;
				fine = i-1;
			}else {
				while(i < s.length() && s.charAt(i) != ' ')
					i++;
				n_par++;
				fine = i-1;
			}
		}
		System.out.println(fine);
		
	}

	public static void main(String[] args) {
		File file = new File("./res/txt/help.txt");
		System.out.println(file.getAbsolutePath());
		/*Prova a = new Prova();
		a.format1();
		String file = new String("users.json");
		JSONParser parser = new JSONParser();
		try {
			FileReader prova = new FileReader("C:\\Users\\PC\\Desktop\\users.json");
			JSONArray temp = (JSONArray) parser.parse(new FileReader("C:\\Users\\PC\\Desktop\\users.json"));
			//Object _prova = (JSONArray) parser.parse(prova);
			//System.out.println(temp);
			Iterator<JSONObject> i = temp.iterator();
			while(i.hasNext()) {
				System.out.println(i.next().get("name"));
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}*/
		//System.out.println(args[0] + " " + args[1]);
	}
}
