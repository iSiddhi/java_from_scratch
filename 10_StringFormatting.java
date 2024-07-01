// new keywprd is use to create a object from class
class HelloWorld{
    public static void main(String[] args){
        String name = "siddhi";
        String Countryname= "india";
        int age = 26;
        double gpa = 26;
        char percentSign= '%';
        boolean amITellingTheTruth= false;
        
    //   System.out.println("Hello world!,my name is"+  name +  " and i am from " + Countryname +   " i am "+ age + " years old ");
       
       
    //   formatted string
    String formattedString = String.format("my name is %s. i am from %s. my  age is  %d . my gpa is %f . i have attended 100 % of my university classes . These are all %b claims." , name,Countryname.age, gpa,percentSign,amITellingTheTruth);
    System.out.println(formattedString);
       
        // System.out.println(name);
        
    }
}



