package opencsv;

import com.opencsv.bean.CsvBindByPosition;


public class Prova {

    @CsvBindByPosition( position = 0 )
    private String Name;

    @CsvBindByPosition( position = 1 )
    private String Sex;

    @CsvBindByPosition( position = 2 )
    private int Age;

    @CsvBindByPosition( position = 3 )
    private double Height;

    @CsvBindByPosition( position = 4 )
    private double Weight;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }


    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
}
