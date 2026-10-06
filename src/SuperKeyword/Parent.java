package SuperKeyword;

public class Parent {

	
    public Parent() {
    	this("Lokes");
        System.out.println("No argument constructor of super class");
    }

    public Parent(String name) {
        System.out.println("Parameter Constructor " + name);
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("Child class");
    }
}