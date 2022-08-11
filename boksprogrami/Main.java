package boksprogrami;



public class Main {

	public static void main(String[] args) {
        Fighter f1=new Fighter("Omer", 15 , 80, 100, 30);
        Fighter f2=new Fighter("Alper ", 10 , 95, 110, 40);


        Ring fight=new Ring(f1,f2,100,110);
        fight.run();
	    
	}
}