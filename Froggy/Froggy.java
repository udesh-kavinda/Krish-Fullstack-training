import java.util.Scanner;



public class Froggy {

    public static void main(String[] args) {
        float distance=0;
        
        System.out.println("Please enter The Distence ");

        Scanner in = new Scanner(System.in);  


        distance=in.nextInt();


        if(distance>9){
            Float Distance=(distance%9);
            int count=(int)(distance/9);

            int totalJumps=(getJumps(Distance))+(4*count);

            double totalTime=(getTime(Distance))+(6.5*count);

            System.out.println("Total Jump is "+totalJumps+" Total Time is "+totalTime);
        
        }
        else if (distance<=9){
            

            int totalJumps=(getJumps(distance));

            double totalTime=(getTime(distance));

            System.out.println("Total Jump is "+totalJumps+" Total Time is "+totalTime);


        }

}



    static int getJumps(float distance){

        int jumps=0;

            if(distance<=5){

                jumps=0;
    
            }
            else if(5< distance && distance <=8){
                jumps=1;
    
            }
            else if (8< distance && distance <=9){
                jumps=2;
    
            }

            return jumps;

    };

    static float getTime(float distance){

    
        float time=0;

        if(distance<=5){

            time=0;

        }
        else if(5< distance && distance <=8){
            time=1;

        }
        else if (8< distance && distance <=9){
            time=3;

        }

        return time;
       

    }

}
