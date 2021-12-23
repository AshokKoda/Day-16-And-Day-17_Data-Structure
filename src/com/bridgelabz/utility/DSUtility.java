package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DSUtility {

	/**
	 *reading file and return in string
	 * 
	 * @param path path of file
	 * @return returns the string value which is read from file
	 * @throws IOException checking exception for file operation
	 */
	public String readFile(String path) throws IOException {
		String str = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}
	
	/**
	 * writing string into file
	 * 
	 * @param path path of file
	 * @param str  input from user end
	 * @throws IOException checking exception for file operation
	 */
	public String writeFile(String path, String str) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(str);
		bufferedWriter.close();
		return "\nFile is Written...";
	}
}
