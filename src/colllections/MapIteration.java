package colllections;
import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Lokesh");
        employees.put(102, "Ravi");
        employees.put(103, "Kiran");

        for (Map.Entry<Integer, String> entry
                : employees.entrySet()) {

            System.out.println(
                "ID: " + entry.getKey()
                + ", Name: " + entry.getValue()
            );
        }
    }
}