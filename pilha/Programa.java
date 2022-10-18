public class Programa {
    public static void main(String[] args) {
        
        Animes anime1 = new Animes("Naruto Shippuden", 100);
        Animes anime2 = new Animes("Jujutsu Kaisen 0", 90);
        Animes anime3 = new Animes("shingeki no kyojin", 150);
        Animes anime4 = new Animes("kimetsu no yaiba", 95);

        Pilha pilha = new Pilha();

        pilha.inserir(anime1);
        pilha.inserir(anime2);
        pilha.inserir(anime3);
        pilha.inserir(anime4);

        String CSI = "\u001B[";
                System.out.print (CSI + "31" + "m");
                System.out.print ("Retirado: " + pilha.retirar().nome);
                System.out.println (CSI + "m");
    }
}