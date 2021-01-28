import java.util.Scanner;
import java.util.ArrayList;

public class Application extends Student {

    enum classOfDegree {
        first_class,
        second_class,
        third_class,
    }

    public static void main(String[] args){
        Scanner inputobject = new Scanner(System.in);
        System.out.println("Enter Matric No");
        String studentMatric_No =inputobject.nextLine();


        System.out.println("Enter CPGA ");
        float cpga = inputobject.nextFloat();

        if (cpga > 4.5){
            System.out.println(classOfDegree.first_class);
        } else if (cpga < 4.5 && cpga>= 3.5) {
            System.out.println(classOfDegree.second_class);
        }else {
            System.out.println(classOfDegree.third_class);
        }


       // Application appobject = new Application();
     //appobject.setMatric_no(studentMatric_No);


     //ArrayList<String> studentData = new ArrayList<>();
       // studentData.add(studentMatric_No);
        //studentData.add("Laide");
        //studentData.add("200 Level");
        //studentData.add("Computer Science");
        //studentData.add("Science and Technology");
        //System.out.println(studentData);
        //System.out.println(appobject.getUniversity());
        //System.out.println("Your matric number is "+appobject.getMatric_no());


    }
}

