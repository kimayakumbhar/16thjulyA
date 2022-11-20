package controlstatement;

public class sample16 {

	public void j1(int testscore)
	{
		 char grade;
		if (testscore >= 90)
        {
            grade = 'A';
        }
        else if (testscore >= 80) 
        {
            grade = 'B';
        }
        else if (testscore >= 70)
        {
            grade = 'C';
        } 
        else if (testscore >= 60)
        {
            grade = 'D';
        } 
        else 
        {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}


		