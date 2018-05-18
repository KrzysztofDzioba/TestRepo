interface A {
    default void performAction() {
    }
}
interface B extends A {
    @Override
    default void performAction() {
    }
}
interface C extends A {

    default void performAction() {
    }
}