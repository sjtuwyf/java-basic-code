package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest03 {
    public static void main(String[] args) {
        HashMap<Car, Integer> hm = new HashMap<>();

        Car car1 = new Car("a", "aa");
        Car car2 = new Car("b", "bb");
        Car car3 = new Car("c", "cc");


        hm.put(car1,10000);
        hm.put(car2,10000);
        hm.put(car3,10000);

        Set<Car> cars = hm.keySet();

        for (Car car : cars) {
            System.out.println(car.getName()+car.getColor()+hm.get(car));

        }

        Set<Map.Entry<Car, Integer>> entries = hm.entrySet();

        for (Map.Entry<Car, Integer> entry : entries) {
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName()+key.getColor()+value);
        }


    }
}
