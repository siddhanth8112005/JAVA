 class nosynchthread extendsThread{
    String arg;
     public no synchthread(String a){
        msg=5;
     }
     public static void DisplayMessage(String msg){
        System.out.print("+msg");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.print("]");

     }
     public void run(){
        DisplayMessage(msg);
     }
 }

 