package Misc;

interface A {

    void a();
}

interface B {

    void b();
}

class MultipleInheritance implements A, B {

    public void a() {

        System.out.println("This is from interface A.");
    }

    public void b() {

        System.out.println("This is from interface B.");
    }

    public static void main(String[] args) {
        
        MultipleInheritance obj = new MultipleInheritance();

        obj.a();
        obj.b();
    }
}
