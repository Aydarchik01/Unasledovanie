public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String coding() {
        return "Baccend";
    }


    @Override
    public String toString() {
        return "Programmer\n" +
                "Company name: " + companyName + "\n" +
                super.toString();
    }
}
