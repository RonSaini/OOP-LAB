import java.util.*;

class Building
{
    private String sqft;
    private String stories;

    Building(String sqft, String stories)
    {
        this.sqft = sqft;
        this.stories = stories;
    }

    void setsqft(String sqft)
    {
        this.sqft = sqft;
    }
    String getsqft()
    {
        return sqft;
    }
    void setstories(String stories)
    {
        this.stories = stories;
    }
    String getstories()
    {
        return stories;
    }
}

class House extends Building
{
    private String NumBed;
    private String NumBath;

    House(String sqft, String stories,String NumBed, String NumBath)
    {
        super(sqft,stories);
        this.NumBed = NumBed;
        this.NumBath = NumBath;
    }

    void setBed(String NumBed)
    {
        this.NumBed = NumBed;
    }
    String getNumBed()
    {
        return NumBed;
    }
    void setBath(String NumBath)
    {
        this.NumBath = NumBath;
    }
    String getBath()
    {
        return NumBath;
    }
}

class School extends Building
{
    private String NumClass;
    private String GradeLevel;

    School(String sqft, String stories, String NumClass, String GradeLevel)
    {
        super(sqft,stories);
        this.NumClass = NumClass;
        this.GradeLevel = GradeLevel;
    }

    void setC(String NumClass)
    {
        this.NumClass = NumClass;
    }
    String getNumClass()
    {
        return NumClass;
    }
    void setG(String GradeLevel)
    {
        this.GradeLevel = GradeLevel;
    }
    String getGradeLevel()
    {
        return GradeLevel;
    }
}


class W6Q2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Building A = new Building("200","8");
        House B = new House("200","8","4","2");
        School C = new School("200","8","10","Junior");

        System.out.println("\nBuilding Details.");
		System.out.println("Building Sq Footage: "+A.getsqft());
		System.out.println("No.of Stories in building: "+A.getstories());

		System.out.println("\nHouse Details.");
		System.out.println("No.of bedroom in house: "+B.getNumBed());
		System.out.println("No.of bath: "+B.getBath());

		System.out.println("\nSchool Details.");
		System.out.println("No.of classrooms: "+C.getNumClass());
		System.out.println("Grade Level: "+C.getGradeLevel());


    }
}
