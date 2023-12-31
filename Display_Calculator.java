import java.util.Scanner;
public class Display_Calculator {
    public static double width_ratio;
    public static double height_ratio;
    public static double diagonal;
    public static double width_cm;
    public static double height_cm;
    public static double width_inch_to_cm(){
        return 2.54*width_ratio*Math.sqrt((diagonal*diagonal)/(width_ratio*width_ratio+height_ratio*height_ratio));
    }
    public static double height_inch_to_cm(){
        return 2.54*height_ratio*Math.sqrt((diagonal*diagonal)/(width_ratio*width_ratio+height_ratio*height_ratio));    
    }
    public static void Notice_Display(double width_cm, double height_cm) {
        System.out.println("*******************");
        System.out.println("가로 길이 ="+width_cm+"cm");
        System.out.println("세로 길이 ="+height_cm+"cm");
        System.out.println("면적(넓이) = "+width_cm*height_cm+"cm^2");
        System.out.println("*******************");
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        while (true) {
        System.out.println("화면비를 입력하세요(가로)");
            width_ratio=in.nextFloat();
        System.out.println("화면비를 입력하세요(세로)");    
            height_ratio=in.nextFloat();
        System.out.println("인치를 입력하세요");    
            diagonal=in.nextFloat();
      
        double width = width_inch_to_cm();
        double height = height_inch_to_cm();
        Notice_Display(width, height);
    }
    }    
    }


}