public class Calculator{
    private int decimal;
    private String binary;
    private int bit;
    public Calculator(){
        this.decimal = 0;
        this.binary ="";
        this.bit = 0;
    }
    public static int[] bitArrBuilder(int bit){
        int[] twoComp = new int[bit - 1];
        int i = 0;
        int comp = 1;
        for(i = 0; i < bit -1; i++){
            twoComp[i] = comp;
            comp = comp * 2;
        }
        return twoComp;
    }
    public String toBinary(int[] array){


    }
}
