package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class SubScan {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "GBK2312"));
		System.out.println("Please input");
		String str = br.readLine();
		System.out.println("str:" + str);
	}

}
