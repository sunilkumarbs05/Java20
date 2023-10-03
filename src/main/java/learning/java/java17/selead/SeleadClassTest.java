package learning.java.java17.selead;


sealed class A permits B, C {

}

non-sealed class B extends A {
}

final class C extends A {


}



public class SeleadClassTest {
    public static void main(String[] args) {

    }
}
