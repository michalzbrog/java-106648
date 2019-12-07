package cwiczenia2_5;

public class ZadaniePerson 
{
public static void main(String[] args) 
	{
		Student michal = new Student(3,1,"informatyka");
		michal.setUni("UKSW");
		michal.setRok(21);
		michal.setRace("White");
		((Student) michal).setJob("Security");
		michal.getAll();
		michal.getUni();
		}
}