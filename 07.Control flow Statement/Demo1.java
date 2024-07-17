public class Demo1 {
    public static void main(String[] args) {
        // ?gst
        // ? luxury item-->28 , gold biscuit ---> 3%, tiger -->5%
        int item=2;
        int gst=0;


        // if(item==1){
        //     gst=28;
        // }
        // else if(item==2){
        //     gst=3;
        // }
        // else if(item==3){
        //     gst=5;
        // }
        // ? we can pass string, char, int, enum
        switch(item){ 
            case 1: gst=28; 
            case 2:gst=3; 
            case 3:gst=5; break;
            default :gst=1; break;
        }
        System.out.println(gst);



    }
}
