import java.util.Scanner;

/**
 * Display_Calculator
 */
public class Display_Calculator {
        public static double width_ratio;
        public static double height_ratio;
        public static double diagonal;
      
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        while (true) {
        System.out.println("화면비를 입력하세요(가로)");
            width_ratio=in.nextFloat();
        System.out.println("화면비를 입력하세요(세로)");    
            height_ratio=in.nextFloat();
        System.out.println("인치를 입력하세요");    
            diagonal=in.nextFloat();
        double width_inch = (double) ((double) width_ratio*Math.sqrt((diagonal*diagonal)/(width_ratio*width_ratio+height_ratio*height_ratio)));
        double height_inch = (double) ((double) height_ratio*Math.sqrt((diagonal*diagonal)/(width_ratio*width_ratio+height_ratio*height_ratio)));    

        double width_cm = width_inch*2.54;
        double height_cm = (double) (height_inch*2.54);

      
        Notice_Display(width_cm, height_cm);
    }
    }    
    }

    public static void Notice_Display(double width_cm, double height_cm) {
        System.out.println("-----------------------------");
        System.out.println("가로 길이 ="+width_cm+"cm");
        System.out.println("세로 길이 ="+height_cm+"cm");
        System.out.println("면적(넓이) = "+width_cm*height_cm+"cm^2");
        System.out.println("-----------------------------");
    }
}