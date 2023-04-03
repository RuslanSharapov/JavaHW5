//  Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> pb = new HashMap<>();
  
        // Добавляем имя сотрудника и его телефон
        pb.put("Иван Иванов", new ArrayList<Integer>());
        pb.get("Иван Иванов").add(224);
        pb.get("Иван Иванов").add(111);
        
        pb.put("Светлана Петрова", new ArrayList<Integer>());
        pb.get("Светлана Петрова").add(225);
        
        pb.put("Кристина Белова", new ArrayList<Integer>());
        pb.get("Кристина Белова").add(226);
        pb.get("Кристина Белова").add(104);
        
        System.out.println(pb);
              
        System.out.println("Количество номеров телефонов у сотрудников: ");
        
        for (Map.Entry<String, ArrayList<Integer>> entry : pb.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue().size() + " номеров телефона");
            }
        }
    }
}
