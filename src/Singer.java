public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }
    public Singer(){

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public String singing(){
        return "Djaz";
    }

    @Override
    public String toString() {
        return "Singer\n" +
                "Band name: " + bandName + "\n" +
                super.toString();
    }
}
