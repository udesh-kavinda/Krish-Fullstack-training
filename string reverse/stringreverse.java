public class stringreverse {

        public static void main (String args[]){

            String sentence = "apple";

            int length =sentence.length();
            char c[] =sentence.toCharArray();
            char r[] = new char[length];

            for(int i=length;i>=1;i--){
                r[i-1]=c[(length)-i];
            }

            String reverse = new String(r);
            System.out.println(reverse);

        }
    }