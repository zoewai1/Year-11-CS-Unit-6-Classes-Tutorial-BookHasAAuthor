public class Author
{
    // properties
    private String name;
    private String email;
    private char gender;
    // constructors
    public Author (String name , String email , char gender)
    {
        if (gender == 'm' || gender == 'f')
        {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
    }
    public String getName ()
        {
            return name;
        }

    public String getEmail ()
        {
            return email;
        }

    public void setEmail (String email)
    {
        this.email = email;
    }
    public char getGender ()
    {
        return gender;
    }

    public String toString ()
    {
        String toString = "" + name + " (" + gender + ") at " + email;
        return toString;
    }
    // behaviours
}
