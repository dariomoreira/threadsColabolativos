

public class ProtectorPantalla extends Thread {
    String palabra;
    int demora;
    
    ProtectorPantalla(String algo,int retardo)
        {
            palabra=algo;
            demora=retardo;
        }
    public void run(){
        try   {
            for (int i=0; i<8; i++){
                System.out.println(palabra+" ");
                sleep(demora);
                }
            }catch(InterruptedException e) {return ;}
        
        } 
    public static void main(String[] args) {
        System.out.println("Primer repositorio en gitHub");
        new ProtectorPantalla("Hola GitHub",400).start();
    }
}