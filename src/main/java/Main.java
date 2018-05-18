import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Klasa kl = new Klasa();
        Klasa kll = null;
        try {
            kll = (Klasa) kl.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        kll.kicha();
        System.out.println(kll == kl);
        kl.equals("ee");
        String elo = "fe";
        elo.equals("ef");
        System.out.println(Objects.equals(kl, kll));
        MyInterface.createAction();
        kl.czesc();
        System.out.println("Czeesc");
        System.out.println();
        System.out.println();

    }

}
