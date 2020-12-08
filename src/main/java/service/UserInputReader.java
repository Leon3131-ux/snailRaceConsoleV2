package service;

import java.util.Scanner;

public class UserInputReader {

    Scanner scanner = new Scanner(System.in);

    public int readValidInt(){

        String userInputString = scanner.nextLine();

        return Integer.parseInt(userInputString);
    }


}
