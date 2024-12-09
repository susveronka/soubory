public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       Evidence evidence = new Evidence();
       try {
           //evidence.nactiOsobyZeSeznamu
           evidence.pridejOsobu("Petr"); //parametry a zapíše se jedna po každé spuštění
           evidence.zapisOsobyDoSouboru(nazevSouboru, oddelovac);
       }

       catch (ChybaException e){
           System.err.println("chyba");
       }
    }
}