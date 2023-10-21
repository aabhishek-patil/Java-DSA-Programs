class Polymorphism_runtime {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Polymorphism_runtime {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Polymorphism_runtime {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Polymorphism_runtime {
    void draw() {
        System.out.println("drawing triangle...");
    }
}

class TestPolymorphism2 {
    public static void main(String args[]) {
        Polymorphism_runtime s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}

