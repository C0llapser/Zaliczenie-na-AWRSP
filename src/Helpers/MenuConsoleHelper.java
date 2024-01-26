package Helpers;

import Core.DailyPhisicalEffort;
import Core.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuConsoleHelper {

    public User IniciateUser() throws IOException {
        User user = new User();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Name :");
        user.setImie(br.readLine());
        System.out.println("Surname :");
        user.setNazwisko(br.readLine());
        System.out.println("Age :");
        user.setAge(Integer.valueOf(br.readLine()));
        System.out.println("Weight :");
        user.setWeight(Integer.valueOf(br.readLine()));
        System.out.println("Choose daily phisical effort");
        System.out.println("1.Low 2.Medium 3.High 4.Olimpian");
        user.setDailyPhisicalEffort(DailyPhisicalEffort.valueOf(setEnum(Integer.valueOf(br.readLine()))));

        return user;
    }

    private String setEnum(int number)
    {
        return switch (number) {
            case 1 -> "LOW";
            case 2 -> "MEDIUM";
            case 3 -> "HIGH";
            case 4 -> "OLIMPIAN";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
