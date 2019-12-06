package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        File input = new File("fuelInput.txt");
        Scanner sc = new Scanner(input);
        List<Integer> list = new ArrayList<>();
        
        while (sc.hasNext()) {
            int number = sc.nextInt();
            list.add(number);
        }

        System.out.println(
        list.stream()
        .mapToDouble(i -> Math.floor(i / 3) - 2)
        .sum()
        );
        

    }
}