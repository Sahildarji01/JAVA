import java.util.Scanner;
public class gradecalculater {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER STUDENT GRADE:");
    double percentage = input.nextDouble();
    if(percentage>=80){
        System.out.println("GRADE: DISTINCTION");
    }
    else if(percentage>=60 && percentage<80){
        System.out.println("GRADE: FIRST CLASS");
    }
    else if(percentage>=50 && percentage<60){
        System.out.println("GRADE: SECOND CLASS");
    } 
    else {
        System.out.println("GRADE: FAIL");
    }
}

    


    }

