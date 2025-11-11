public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10]; 

        System.out.println("Vetor não ordenado:");
        for(int i=0; i<vetor.length; i++){
            vetor[i]= (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int aux, menorPosicao;
        for(int i=0; i<vetor.length; i++){
            menorPosicao= i;
            for(int j= i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[menorPosicao]){
                    menorPosicao=j;
                }
            }
            aux=vetor[menorPosicao];
            vetor[menorPosicao] = vetor[i];
            vetor[i] = aux;
        }

         System.out.println("Vetor já ordenado:");
        for(int i=0; i<vetor.length; i++){
            
            System.out.println(vetor[i]);
        }

    }
}
