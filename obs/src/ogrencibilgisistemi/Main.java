package ogrencibilgisistemi;

public class Main {

	public static void main(String[] args) {
		   	Course Matematik = new Course("Matematik", "MAT101", "MAT");
	        Course Fizik = new Course("Fizik", "FZK101", "FZK");
	        Course Turkce = new Course("Turkce", "TUR101", "TUR");

	        Teacher t1 = new Teacher("Engin Kalkan", "90550000001", "MAT");
	        Teacher t2 = new Teacher("Mehmet Güneş", "90550000002", "FZK");
	        Teacher t3 = new Teacher("Ali Korkmaz", "90550000003", "TUR");

	        Matematik.addTeacher(t1);
	        Fizik.addTeacher(t2);
	        Turkce.addTeacher(t3);

	        Student s1 = new Student("Omer Gunes", 4, "44134678", Matematik, Fizik, Turkce);
	        s1.addBulkExamNote(50,65,80);
	        s1.isPass();

	        Student s2 = new Student("Halil Demir", 4, "44134679", Matematik, Fizik, Turkce);
	        s2.addBulkExamNote(100,50,40);
	        s2.isPass();

	        Student s3 = new Student("Mustafa Kilic", 4, "44134680", Matematik, Fizik, Turkce);
	        s3.addBulkExamNote(50,15,75);
	        s3.isPass();
	}   
	}
