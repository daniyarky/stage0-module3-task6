package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float ten=numberToBeRounded*10;
        int rem=(int)(ten%10);
        if(rem>4){
            ten++;
        }
        int newres=(int) ten;
//        if(newres%newres!=0){
//            float remainder=newres%newres;
//            newres=(int)newres-remainder;
//        }
        System.out.println(newres);
    }
}
