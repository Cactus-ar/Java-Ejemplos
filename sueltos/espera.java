import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Espera hace exactamente eso. es un delay de n segundos



class espera {
    public static void main(String[] args) {

        int segundos = 5;

        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(espera::MiTarea, 0, segundos, TimeUnit.SECONDS);
    }
    
    private static void MiTarea() {
        System.out.println("Procesando");
        System.out.println("-----------");
        for(int i=0; i<=10; i++){
            
            if(i==10){
                System.out.println(i + ".");
            }else {
                System.out.print(i + ", ");
            }
        }

    }
        
}