class Operations{
    private boolean knifes[];
    private int nPhilosophers;

    public Operations(){
        this.nPhilosophers = 5;
        createKnifes();
    }

    public Operations(int n){
        this.nPhilosophers = n;
        createKnifes();
    }

    private void createKnifes(){
       knifes = new boolean [nPhilosophers];
       for(int i=0; i<nPhilosophers; i++){
           knifes[i] = true;
       }
    }

    synchronized public void gonna_eat(int i){
        boolean right=knifes[i];
        boolean left=knifes[((i==0)?nPhilosophers-1:i-1)];

        while(true){
            if(right == true && left == true) break;
            else {
                try{
                    wait();
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
        //lock the knifes
        knifes[i] = knifes[((i==0)?nPhilosophers-1:i-1)] = false;
    }

    synchronized public void gonna_finish(int i){
        knifes[i] = knifes[((i==0)?nPhilosophers-1:i-1)] = true;
        System.out.println("Philosopher ["+(i+1)+"] finished eating");
        notify();
    }
}

class Philosopher implements Runnable{
    private Operations oper;
    private int n;

    Philosopher(Operations oper, int n){
        this.oper = oper;
        this.n    = n;
    }

    public void run(){
        for(int c=1; c<=2; c++){
            //eat
            oper.gonna_eat(n);
        
            try{
                System.out.println("Philosopher ["+(n+1)+"] is eating ("+c+")");
                Thread.sleep((int) (Math.random()*5000));
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            //finish
            oper.gonna_finish(n);
            try{
                System.out.println("Philosopher ["+(n+1)+"] is thinking");
                Thread.sleep((int)(Math.random()*7000));
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class DiningPhilosopher{
    public static void main(String args[]){
        Operations oper = new Operations(5);
        Thread [] philthreads = new Thread[5];
        for(int i=0; i<5; i++){
            philthreads[i] = new Thread(new Philosopher(oper, i));
        }
        for(int i=0; i<5; i++){
            philthreads[i].start();
        }
    }
}

