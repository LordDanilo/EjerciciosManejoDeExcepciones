public class Example{
    public void sampleMethod(){
        try{
            int res = 10/0;
            System.out.println(res);
        }catch(Exception e){
            System.out.println("Ocurrio algo: "+e);
        }finally{
            System.out.println("Esto ocurre siempre!!!");
        }
    }
}
