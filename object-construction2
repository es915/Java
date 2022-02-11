public class Main {
	public static void main(String[] args) {
		// 각 학생들에게 담임 선생님 정보를 저장하고 출력해주세요.

		Teacher t1 = new Teacher(45, "이순신", "역사");
		Teacher t2 = new Teacher( 52, "임꺽정", "체육");
		
	    Student s1 = new Student(1, "홍길동", 20);
	    s1.setTeacher(t1);
	    
	    Student s2 = new Student(2, "홍길순", 21);
	    s2.setTeacher(t2);

	    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.
	    s1.introduce();
	    // 출력 : 안녕하세요 저는 2번 21살 홍길순이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
	    s2.introduce();
	    
	    // 두 사람의 담임선생임이 바뀌었습니다. 아래와 같이 출력해주세요. 
	    s1.setTeacher(t2);
	    s2.setTeacher(t1);
	    
	    
	    s1.introduce();
	    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
	    s2.introduce();
  
	    
	}
}	

class Teacher {
	private int age;
	private String subject;
	private String name;
	
	Teacher(int age, String name, String subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
}

class Student {
	private int age;
	private String name;
	private int num;
	
	private Teacher teacher;
	
	Student(int num, String name, int age) {
		this.age = age;
		this.name = name;
		this.num = num;
		
	}
	
	void introduce() {
		System.out.printf("안녕하세요 저는 %d번 %d살 %s이고요, 저의 담임선생님은 %d살 %s과목의 %s 선생님이십니다.\n",this.num, this.age, this.name, this.teacher.getAge(), this.teacher.getSubject(), this.teacher.getName());
	}
		
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
	
