public class Line {

    public synchronized void getLine(){
        for(int i = 0; i < 3; i++){
            System.out.println(i);
            try{
                Thread.sleep(400);
            }catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}
