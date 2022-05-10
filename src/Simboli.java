public class Simboli implements Runnable{
    private String simbolo;
    public int numero;

    public Simboli (String simbolo,int numero){
        this.simbolo=simbolo;
        this.numero=numero;

    }

    public String getSimbolo(){
        return this.simbolo; 
    }

    public void setSimbolo(String simbolo){
        this.simbolo=simbolo; 
    }

    @Override
    public void run(){
        for(int i=1;i < numero+1;i++){
            if(i%10==0){
                System.out.println();
            }
            System.out.print(simbolo);
        }
    }
}
