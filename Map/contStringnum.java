package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class contStringnum {
    public static void main(String[] args) {
        System.out.println("info you string: ");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(chars[i])==false){
                map.put(chars[i],1);
            }else {
                Integer count = map.get(chars[i]);
                count++;
                map.put(chars[i],count);

            }
        }
        System.out.println(map);
    }
}
