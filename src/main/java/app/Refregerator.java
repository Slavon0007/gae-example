package app;

public class Refregerator {
    public static void main(String[] args) {
        int value = refregerator(101, 1);
        
        System.out.print(value);
    }

    public static int refregerator(int weight,int type) {
        int meat = 1;
        int vegetables = 2;
        int water = 3;
        
        int result = 0;
        
        if (weight <= 100) {
            if (type == meat) {
                result = weight * 60;
            } else if(type == vegetables) {
                result = weight * 40;
            }  else if(type == water) {
                result = weight * 20;
            }
        } if (weight > 100 && weight <= 200) {
            if (type == meat) {
                result = weight * 40;
            } else if(type == vegetables) {
                result =weight * 20;
            }  else if(type == water) {
                result = weight * 10;
            }
        }
        
        return result;
    }
}