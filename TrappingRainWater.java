public class TrappingRainWater {
   public static void main(String[] args) {
    int pillars[] = {0,1,0,2,1,3,0,2};
    if(pillars.length == 0){
        System.out.println("No Pillar Exist  , so we can't store any water");
    }
    //Left Max Pillar(prefix max)
    int leftPillarMax[] = new int[pillars.length];
    leftPillarMax[0] = pillars[0];
    for(int i = 1 ; i < pillars.length ; i++){
        leftPillarMax[i] = Math.max(leftPillarMax[i-1] , pillars[i]);
    }
    System.out.println("Left Max Pillar");
    for(int i : leftPillarMax){
        System.out.print(i + " ");
    }
    System.out.println();
    //Right Max Pillar
    int rightPillarMax[] = new int[pillars.length];
    rightPillarMax[rightPillarMax.length-1] = pillars[pillars.length-1];
    for(int i = rightPillarMax.length-2 ; i >= 0 ; i--){
        rightPillarMax[i] = Math.max(rightPillarMax[i+1] , pillars[i]);
    }
     System.out.println("Right Max Pillar");
    for(int i : rightPillarMax){
        System.out.print(i + " ");
    }
    System.out.println();

    //Find deciding Height
    int AmountOfWater = 0 ;
    for(int i = 0 ; i < pillars.length ; i++){
        int currentPillar = pillars[i];
        int DecideHeight = Math.min(leftPillarMax[i] , rightPillarMax[i]);
        if(DecideHeight > currentPillar){
            AmountOfWater += DecideHeight - currentPillar;
        }
    }
    System.out.println(AmountOfWater + " ");
   }
}
