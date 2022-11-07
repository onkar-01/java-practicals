class volume{
    int l,b,h;
    volume(){
        l=10;
        b=20;
        h=30;
    }
    int cal_volume(){
        return l*b*h;
    }
}
  
public class volume6 {
    public static void main(String[] args) {
        volume v=new volume();
        System.out.println(v.cal_volume());
    }
    
}
