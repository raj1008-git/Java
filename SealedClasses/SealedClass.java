import java.util.concurrent.Callable;

sealed class A extends Thread implements Cloneable permits B, C {
}

non-sealed class B extends A {
}

final class C extends A {

}

class D extends B {

}