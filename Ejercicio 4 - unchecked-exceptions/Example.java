public class Example{
    public void sampleMethod(){
        try{
            int[] prices = {12,15,21};
            System.out.println(prices[25]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sucedio algo: "+e);
        }
    }
}
