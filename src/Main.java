public class Main {

    public static void main(String[] args) {
        int num=642735,numCounter=0;
        int tempNum=num;
        int numValue;
        int numPow,result=0;

        System.out.println(num);
        tempNum=num;
         while(tempNum !=0){

             tempNum/=10;
             System.out.println(tempNum);
             numCounter++;

         }
        System.out.println("Basamak sayisi: "+numCounter);
        tempNum=num;
        while (tempNum !=0){
            numValue =tempNum%10;

            numPow=1;
            for (int i=1;i<=numCounter;i++){
                numPow*=numValue;
            }
            result+=numPow;
            tempNum/=10;
        }
        System.out.println(result);

        if (result==num){
            System.out.println("Bu bir Armstrong sayisidir:");
        }else{
            System.out.println("Bu bir Armstrong sayisi degildir");
        }

    }
}
