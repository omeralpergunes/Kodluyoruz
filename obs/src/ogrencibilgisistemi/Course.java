package ogrencibilgisistemi;

public class Course {

		Teacher teacher;
		
		String name;
		String code;
		String prefix;
		int note;
		
		public Course(String name, String code, String prefix) {
			this.name=name;
			this.code=code;
			this.prefix=prefix;
			this.note=0;
			
			}
		public void addTeacher(Teacher T) {
			
			if(this.prefix.equals(this.prefix)) {
				this.teacher=T;
				System.out.print("Giris basarili");
			}else {
				System.out.print("Ögretmen ve girilen ders uyusmamaktadır.");
			}
		
		}
		void printTeacher() {
			if(teacher!=null) {
				System.out.print(this.name + " Dersinin Egitmeni " + teacher.name);
			}
			else {
				System.out.print(this.name + " Girdiginiz derste egitmen bulunmamaktadir.");
			}
		}
	}


