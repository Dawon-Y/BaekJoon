import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        int max = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                max = Math.max(max, map.get(c));
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        if (list.size() > 1) {
            System.out.print("?");
        }
        else {
            System.out.print(list.get(0));
        }
    }
}