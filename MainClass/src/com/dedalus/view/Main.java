
package com.dedalus.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

import com.dedalus.controller.EmployeeController;
import com.dedalus.controller.EmployeeInterface;
import com.dedalus.exception.UserNotFoundException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Welcome to EMS :)");
		try {
			String us = null;
			String pwd = null;

			InputStreamReader ip = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ip);
			System.out.println("enter username value");
			us = br.readLine();
			System.out.println("enter password value");
			pwd = br.readLine();

			if (us.equals("kranthi") && pwd.equals("123")) {

				System.out.println("waiting for Response ");
				Thread.sleep(5000);

				EmployeeInterface ec = new EmployeeController();
				Scanner sc = new Scanner(System.in);
				String ch = null;
				do {
					System.out.println("Enter your choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Serializable");
					System.out.println("4. Deserilizable");

					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						ec.addEmployee();
						break;
					}

					case 2: {
						ec.viewEmployee();
						break;
					}
					case 3: {
						ec.Serialize();
						break;
					}
					case 4: {
						ec.Deseriize();
						break;

					}
					default: {
						System.out.println("Enter a valid number");
						break;
					}
					}

					System.out.println("Do u want to continue Y | y");
					ch = sc.next();

				} while (ch.equals("Y") || ch.equals("y"));
			} else {
				throw new UserNotFoundException("invalid username and password");
			}
		} catch (UserNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			System.out.println("finally...");
		}

		System.out.println("Thanks for using our system.");
		System.exit(0);
	}

}