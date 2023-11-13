import java.util.*;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> houseMap = new HashMap<>();
        houseMap.put("Ярослав Игоревич Баярунас", 28);
        houseMap.put("Дарья Игоревна Январина", 29);
        houseMap.put("Алексей Операторович Маршалко", 33);
        houseMap.put("Николай Лаптевич Филлипов", 35);
        houseMap.put("Сергей Настолкович Хохлов", 17);
        houseMap.put("Екатерина Сеструхина Хохлова", 13);
        houseMap.put("Петр Барфутович Карпов", 27);

        ArrayList<String> residentsHouse = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : houseMap.entrySet()) {
            if (entry.getValue() > 18) {
                residentsHouse.add(entry.getKey());
            }
        }
        Collections.sort(residentsHouse);
        System.out.println("Жильцы, кому больше 18 лет:" + "\n");
        for (String str : residentsHouse) {
            System.out.println(str);
        }
    }
}