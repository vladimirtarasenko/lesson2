public class Main {
    public static void main(String[] args) {




            int rouble=1154;
           String roublestext=Integer.toString(rouble);
           int last=roublestext.length();

           char lastletter=roublestext.charAt(last -1);

           if(lastletter=='1') {
               System.out.println(rouble + " рубль");
           }
        if(lastletter=='2'||lastletter=='3'||lastletter=='4') {
            System.out.println(rouble + " рубля");
        }
            if(lastletter=='5'||lastletter=='6'||lastletter=='7'||lastletter=='8'||lastletter=='9'||lastletter=='0') {
                System.out.println(rouble + " рублей");
           }



        }
    }