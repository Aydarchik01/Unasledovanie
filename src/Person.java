public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String learn() {
        return "Universty";
    }

    public String walk() {
        return "Earth";
    }

    public String eat() {
        return "Eating wholesome food";
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\'' +
                        "Designation: " + designation ;
    }
}
