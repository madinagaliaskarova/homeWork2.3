/* Разработать проверяемое Исключение:
//○ Исключение которое выбрасывается если длина имени больше 20 символов, назовите
//IllegalNameLengthException
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите Ваше имя");
            User user = new User();
            try {
                user.setName(scanner.nextLine());
            } catch (IllegalNameLengthException e) {
                e.printStackTrace();
            }

            user.setAge(scanner.nextInt());
        }

    }
}
