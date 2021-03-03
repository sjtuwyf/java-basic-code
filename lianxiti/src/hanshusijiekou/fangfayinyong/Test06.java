package hanshusijiekou.fangfayinyong;

public class Test06 {
    public static void main(String[] args) {

        Car Q7 = getCar(Car::new);
        Q7.setBrand("奥迪");
    }

    public static Car getCar(BeanFactory<Car> factory) {
        return factory.getBean();
    }
}
