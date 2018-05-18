import java.sql.SQLException;

public class Klasa extends MyAbstractClass implements Cloneable {

    private static String elo = "elo";

//    static {
//        System.out.println("czesc");
//        System.out.println(elo);
//        System.out.println("serio?");
//    }
//
//    static {
//        System.out.println("czesc2");
//    }

    public void kicha() {
        System.out.println("czesc");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
