package colllections;

import java.util.*;

public class MapMethodsDemo {

    public static void main(String[] args) {

        // Creating Map
        Map<Integer, String> employees = new HashMap<>();
        

        // 1. put()
        employees.put(101, "Ravi");
        employees.put(102, "Kiran");
        employees.put(103, "Lokesh");

        System.out.println("After put(): " + employees);

        // 2. put() with existing key
        employees.put(101, "Rahul");

        System.out.println("After updating key 101: " + employees);

        // 3. get()
        System.out.println("Employee with key 102: "
                + employees.get(102));

        // 4. get() with non-existing key
        System.out.println("Employee with key 999: "
                + employees.get(999));

        // 5. getOrDefault()
        System.out.println("Key 999: "
                + employees.getOrDefault(999, "Not Found"));

        // 6. containsKey()
        System.out.println("Contains key 101? "
                + employees.containsKey(101));

        // 7. containsValue()
        System.out.println("Contains value Kiran? "
                + employees.containsValue("Kiran"));

        // 8. size()
        System.out.println("Size: " + employees.size());

        // 9. isEmpty()
        System.out.println("Is empty? "
                + employees.isEmpty());

        // 10. putIfAbsent()
        employees.putIfAbsent(104, "Arjun");

        // Existing key -> does not replace the value
        employees.putIfAbsent(101, "Suresh");

        System.out.println("After putIfAbsent(): "
                + employees);

        // 11. remove(key)
        employees.remove(104);

        System.out.println("After remove(key): "
                + employees);

        // 12. remove(key, value)
        employees.remove(102, "WrongName");

        System.out.println("After wrong remove: "
                + employees);

        employees.remove(102, "Kiran");

        System.out.println("After correct remove: "
                + employees);

        // 13. replace()
        employees.replace(103, "Mahesh");

        System.out.println("After replace(): "
                + employees);

        // 14. replace(key, oldValue, newValue)
        employees.replace(103, "Mahesh", "Lokesh");

        System.out.println("After conditional replace(): "
                + employees);

        // 15. replaceAll()
        employees.replaceAll(
                (key, value) -> value.toUpperCase()
        );

        System.out.println("After replaceAll(): "
                + employees);

        // Creating another Map
        Map<Integer, String> moreEmployees = new HashMap<>();

        moreEmployees.put(104, "Arjun");
        moreEmployees.put(105, "Suresh");

        // 16. putAll()
        employees.putAll(moreEmployees);

        System.out.println("After putAll(): "
                + employees);

        // 17. keySet()
        System.out.println("Keys: "
                + employees.keySet());

        // 18. values()
        System.out.println("Values: "
                + employees.values());

        // 19. entrySet()
        System.out.println("Entries: "
                + employees.entrySet());

        // 20. Iterating using entrySet()
        System.out.println("\nUsing entrySet():");

        for (Map.Entry<Integer, String> entry
                : employees.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> "
                    + entry.getValue()
            );
        }

        // 21. clear()
        employees.clear();

        System.out.println("\nAfter clear(): "
                + employees);

        // 22. isEmpty() after clear
        System.out.println("Is empty? "
                + employees.isEmpty());
    }
}