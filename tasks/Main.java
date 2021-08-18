package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number of task");
		int taskNum = Integer.parseInt(br.readLine());
		
		// Ñ‚ÑƒÑ‚ Ð²Ñ�Ñ‚Ð°Ð²Ð»Ñ�Ñ”Ð¼Ð¾ main Ð½Ð°ÑˆÐ¸Ñ… Ð·Ð°Ð´Ð°Ñ‡ Ñ– Ð±ÑƒÐ´ÐµÐ¼Ð¾ Ð²Ð¸ÐºÐ»Ð¸ÐºÐ°Ñ‚Ð¸ Ð·Ð° Ð´Ð¾Ð¿Ð¾Ð¼Ð¾Ð³Ð¾ÑŽ switch-case
		// Ð´Ð¾Ð±Ð°Ð²Ð»Ñ�Ñ”Ð¼Ð¾ Ð½Ð¾Ð²Ñ– case Ð¿Ð¾ Ð½ÑƒÐ¼ÐµÑ€Ð°Ñ†Ñ–Ñ— 1,2,3, ....
		
		while (true) {
			
			switch (taskNum) {
			
			case 1:
				
				Task.main(args);
				
			case 2:
				
				Task2.main(args);
							
			case 3:
				
				Task3.main(args);
				
			case 4:
				
				Task4.main(args);
				
			}
			
		}
		
}
}

