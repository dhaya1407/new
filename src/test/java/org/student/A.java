package org.student;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class A {
	public static void main(String[] args) {
		
		Date x = new Date(0);
		System.out.println(x);
		SimpleDateFormat c = new SimpleDateFormat("dd/MM/yyyy");
		String format = c.format(x);
		System.out.println(format);
		
	}

}
