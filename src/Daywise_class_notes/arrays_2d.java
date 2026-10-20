package Daywise_class_notes;

public class arrays_2d {
    static void main(String[] args) {
        int [][] stu ={
                {10,20,30,40},
                {40,90,89,98},
                {50,76,77,88},
        };
        for (int i=0;i < stu.length;i++) {
            // System.out.println(stu[i]);
            for (int j = 0; j < stu.length; j++) {
                System.out.println(stu[i][j]);
            }
            System.out.println();
        }
    }
}
