public class Professor extends NewPerson
{
	
	protected String division;
	protected double work_percentage;
	
	public Professor(String fn, int rn, String email, String d, double wp) {
		this.fullName = fn;
		this.registrationNumber = rn;
		this.email = email;
		this.division = d;
		this.work_percentage = wp;
	}
	
	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public double getWork_percentage() {
		return work_percentage;
	}

	public void setWork_percentage(double work_percentage) {
		this.work_percentage = work_percentage;
	}

	public String toString() {
		return "Professor: " + fullName; 
	}
}
