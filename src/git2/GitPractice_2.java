package git2;

public class GitPractice_2 {

	
	String Name = "Prashant Rajput";
	
	void character() {
		
		//if (Name == "Prashant Rajput")                with string literals both == and equals giving the same result
		if (Name.equals("Prashant Rajput"))
		{ System.out.println(Name+"-->"+"Good Boy");}
		
		else {
			System.out.println("Not a Good Boy");
		}
	}
	public static void main(String[] args) {
		
		GitPractice_2 obj1 = new GitPractice_2();
		
		
		obj1.character();
	}

}
