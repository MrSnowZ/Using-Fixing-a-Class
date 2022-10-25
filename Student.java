public class Student
{
    private String name;
    private int year;
    private double gpa;
    private boolean isFailing;
    
    // constructor that is used in the Tester for student information
    public Student(String name, int year, double gpa)
    {
        this.name = name;
        this.year = year;
        this.gpa = gpa;
        isFailing = false;
    }
    
    // setters
    public String getName()
    { return name;}
    public int getYear()
    { return year;}
    public double getGPA()
    { return gpa;}

    public void setFailing()
    {
        if(gpa < 2.3)
        {
            isFailing = true;
        }
        else
        {
            isFailing = false;
        }
    }
    
    public void setGPA(double newGPA)
    {
        gpa = newGPA;
    }
    
    //getters
    public void gotAnF()
    {
        isFailing = true;
    }
    public void gotGradesUp()
    {
        isFailing = false;
    }
    
    
    // tells us if the student is eligible 
    public boolean eligibility()
    {
        if(isFailing)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    // to string that prints student information in our console
    public String toString()
    {
        if(!isFailing)
        {
            String s1 = "is not failing";
            return name + "has a gpa of " + gpa + " and is in the class of " + year + " and " + s1 + ".";
        }
        else
        {
            String s1 = "is failing";
			return name + " has a gpa of "+ gpa + " and is in the class of " + year + " and "+ s1 + ".";
        }
    }
}
