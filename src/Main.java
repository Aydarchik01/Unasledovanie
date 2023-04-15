public class Main {
    public static void main(String[] args) {
        Programmer prog = new Programmer();
        prog.setName("Aydar");
        prog.setDesignation("Student");
        prog.setCompanyName("Google");

        Dancer danc = new Dancer();
        danc.setName("Safia");
        danc.setDesignation("People");
        danc.setGroupName("Black Pink");

        Singer sing = new Singer();
        sing.setName("Aigerim");
        sing.setDesignation("Worker");
        sing.setBandName("Imagen Dragons");

        System.out.println(prog);
        prog.eat();
        prog.learn();
        prog.walk();

        System.out.println("===================");
        System.out.println(danc);
        danc.eat();
        danc.learn();
        danc.walk();

        System.out.println("===================");
        System.out.println(sing);
        sing.eat();
        sing.learn();
        sing.walk();
    }
}