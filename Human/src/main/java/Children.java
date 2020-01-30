import java.util.Arrays;
public class Children extends Human     
{
int iq, mood, gdisease,wealth;                       //public data block
private String scolor = "Brown";
private String ecolor = "Black";
private String gender = "Male";
private int weight = 82;
private int height = 182;                   
private int age = 20;
private String race = "Asian";
private String name = "John Satabimo"; //private data block
     
public void Child(int iq, int mood, int gdisease,int wealth)  //child class public block
{   
    this.iq = iq;
    this.mood = mood;
    this.gdisease = gdisease;
    this.wealth = wealth;
    
}                   

public String toChild()                     //Format of Children class
{
    return String.format("Intellegence Rating: " + iq + "\n" + "Mood Rating: " + mood + "\n" + "Genetic Disease(s): " + gdisease + "\n" + "Wealth: " + wealth);
}

public String toHuman()                     //Format of Human class
{
   return String.format("\nSkin color: " + scolor + "\n" + "Eye color: " + ecolor + "\n" + "Gender: " + gender + "\n" + "Height: " + height + " cm\n" + "Weight: " + weight + " kg\n" + "Age: " + age + "\n"  + "Race: "+ race + "\n" + "Name: " + name + "\n");
}

                

}
