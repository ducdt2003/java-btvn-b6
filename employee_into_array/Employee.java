package employee_into_array;

public class Employee extends Person {
    private double experience;

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Employee() {
    }

    public Employee(int id, String name, int age, double experience) {
        super(id, name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "  id : " + super.getId() +"\n"+
                " name :  " + super.getName() +"\n" +
                " tuổi : " + super.getAge() + "\n" +
                " exp : " + getExperience();
    }
}
