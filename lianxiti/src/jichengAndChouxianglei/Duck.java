package jichengAndChouxianglei;

public class Duck extends Poultry {

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    public Duck() {
    }

    @Override
    public void showSymptom() {
        System.out.println(getSymptom());
    }
}
