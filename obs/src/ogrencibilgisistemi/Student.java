package ogrencibilgisistemi;

public class Student {
	  
		String name,stuNo;
	    int classes;
	    Course Matematik;
	    Course Fizik;
	    Course Turkce;
	    double avarage;
	    boolean isPass;


	    Student(String name, int classes, String stuNo, Course Matematik, Course Fizik, Course Turkce) {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.Matematik = Matematik;
	        this.Fizik = Fizik;
	        this.Turkce = Turkce;
	        calcAvarage();
	        this.isPass = false;
	    }


	    public void addBulkExamNote(int mat, int fizik, int turkce) {

	        if (mat >= 0 && mat <= 100) {
	            this.Matematik.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.Fizik.note = fizik;
	        }

	        if (turkce >= 0 && turkce <= 100) {
	            this.Turkce.note = turkce;
	        }

	    }

	    public void isPass() {
	        if (this.Matematik.note == 0 || this.Fizik.note == 0 || this.Turkce.note == 0) {
	            System.out.println("Notlar girilmemistir");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("Sinifi Gecti ");
	            } else {
	                System.out.println("Sinifta Kaldi");
	            }
	        }
	    }

	    public void calcAvarage() {
	        this.avarage = (this.Fizik.note + this.Turkce.note + this.Matematik.note) / 3;
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("======================");
	        System.out.println("Ogrenci : " + this.name);
	        System.out.println("Matematik Notu : " + this.Matematik.note);
	        System.out.println("Fizik Notu : " + this.Fizik.note);
	        System.out.println("Turkce Notu : " + this.Turkce.note);
	    }

	}


	
