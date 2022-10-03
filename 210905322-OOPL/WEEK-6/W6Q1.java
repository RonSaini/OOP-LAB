import java.util.*;

class Person
{
    private String name;
    private String DOB;

    Person(String name,String DOB)
    {
        this.name = name;
        this.DOB = DOB;
    }
    Person(){}

    void PersonDisplay()
    {
        System.out.println("Name is : "+this.name);
        System.out.println("DOB is : "+this.DOB);
    }
}

class CollegeGraduate extends Person
{
    private double GPA;
    private int YearOfGraduation;

    CollegeGraduate(String name,String DOB,double GPA,int Yearofgraduation)
    {
        super(name,DOB);
        this.GPA = GPA;
        this.YearOfGraduation = YearOfGraduation;
    }

    void CollegeGraduateDisplay()
    {
        super.PersonDisplay();
        System.out.println("GPA is : "+this.GPA);
        System.out.println("Year of Graduation is : "+this.YearOfGraduation);
    }
}

class W6Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("Enter the Birth date : ");
        String DOB = sc.nextLine();
        System.out.println("Enter the GPA : ");
        double GPA = sc.nextDouble();
        System.out.println("Enter the Year of Gradutaion : ");
        int YearOfGraduation = sc.nextInt();

        CollegeGraduate C = new CollegeGraduate(name, DOB, GPA, YearOfGraduation);
        C.CollegeGraduateDisplay();
    }

}