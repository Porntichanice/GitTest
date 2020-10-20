import java.util.*;

public class TestJCF {
   public static void main(String args[]) {
      Map<String, String> map = new TreeMap(new Comparator<String>() {public int compare(String s1, String s2){return s2.compareTo(s1);}});   
      for(char ch = 'A'; ch<='Z';ch++) {
         map.put(ch+"", ch+"");
      }
      System.out.println(map);  
   }

}