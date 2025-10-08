package example.oop.inheritance;



//HAVE TO CREATE OBJECT FOR CHILD
public class Hierarichal_Inheritance {

	public static void main(String[] args) {
		Parent_Hierarichal pr = new Parent_Hierarichal();
		pr.giveproperty();
		
		Child1_Hierichal c1=new Child1_Hierichal();
		c1.giveproperty();
		c1.prop1();
		//CHILD2
		Child2_Hierarichal c2=new Child2_Hierarichal();
		c2.giveproperty();
		c2.prop2();
		//CHILD 3
		Child3_Hierarichal c3=new Child3_Hierarichal();
		c3.giveproperty();
		c3.prop3();
		
		//ANIMALS
		Lion d=new Lion();
		d.wild();
		Cat c=new Cat();
		c.anim();
		c.notwild();

	}

}
class Clasify {
	void anim() {
		System.out.println("Animal are Cute");
	}
}
class Lion extends Clasify{
	void wild() {
		System.out.println("Wild Animal");
	}
}
class Cat extends Clasify{
	void notwild() {
		System.out.println("Not A Wild Animal");
	}
}
