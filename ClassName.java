public class ClassName{
    String name = "Something";
    int age = 54;
    public void showDetails(){
        System.out.println(name + " is " + age + " years old.");
    }
    public static void main(String[] args){
        ClassName objectName = new ClassName();
        
        objectName.showDetails();
    }
}
