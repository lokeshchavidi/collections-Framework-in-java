package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4, 3};

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {

            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {

            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}