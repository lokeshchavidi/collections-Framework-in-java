package colllections;
import java.util.*;

public class HighestSalary {
    public static void main(String[] args) {

        Map<String, Integer> salaries = new HashMap<>();

        salaries.put("Lokesh", 30000);
        salaries.put("Ravi", 45000);
        salaries.put("Kiran", 35000);

        String highestEmployee = "";
        int highestSalary = 0;

        for (Map.Entry<String, Integer> entry
                : salaries.entrySet()) {

            if (entry.getValue() > highestSalary) {

                highestSalary = entry.getValue();
                highestEmployee = entry.getKey();
            }
        }

        System.out.println(
            highestEmployee + " → " + highestSalary
        );
    }
}