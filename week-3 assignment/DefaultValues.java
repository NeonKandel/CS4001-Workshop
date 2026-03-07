public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValues hello = new DefaultValues();

        System.out.println("--- Default Values of Primitives ---");
        System.out.println("byte:\t" + hello.b);
        System.out.println("short:\t" + hello.s);
        System.out.println("int:\t" + hello.i);
        System.out.println("long:\t" + hello.l);
        System.out.println("float:\t" + hello.f);
        System.out.println("double:\t" + hello.d);
        System.out.println("char:\t[" + hello.c + "]"); 
        System.out.println("boolean:" + hello.bool);

        
    }
}