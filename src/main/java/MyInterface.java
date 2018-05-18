public interface MyInterface {

    static void createAction() {
        System.out.println("Jestem w metodzie statycznej interfejsu");
    }

    default void metodka() {
        System.out.println("Metodka");
    }

}
