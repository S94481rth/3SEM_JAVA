class myThread_counting_bms extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("BMS College Of Engineering");
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
            }
        }
    }
}

class myThread_counting_cse extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("CSE");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
            }
        }
    }
}
class Main{
    
    
    
    
    public static void main(String args[]){
        myThread_counting_bms thread1 = new myThread_counting_bms();
        myThread_counting_cse thread2 = new myThread_counting_cse();
        
        thread1.start();
        thread2.start();
        
    }
}
