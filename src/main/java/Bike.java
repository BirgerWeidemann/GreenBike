public class Bike extends Order {

    public Integer id;
    public String name;


    // Konstruktor
    public  Bike()
    {

    }

    public Bike(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }


    // Setter & Getter
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getname()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }



}
