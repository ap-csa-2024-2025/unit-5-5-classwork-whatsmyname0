public class Person
{
    private String firstname;
    private String lastname;
    private int age;
    private int SSN;

    public String getfirstname()
    {
        return firstname;
    }

    public void setfirstname(String input)
    {
        firstname = input;
    }

    public void setlastname(String input)
    {
        lastname = input;
    }

    public void setage(int input)
    {
        age = input;
    }

    public void setSSN(int input)
    {
        SSN = input;
    }

    public String toString()
    {
        String output = "";
        output += "SSN: " + SSN;
        output += "\n\tName: " + firstname + " " + lastname;
        return output;
    }
}
