public class Pilha {
    No primeiro;
    No ultimo;
    public int tamanho;

    //CONSTRUTOR
    Pilha(){
        tamanho = 0;
        ultimo = null;
    }
    //CONFERIR SE A PILHA ESTÁ VAZIA
    public boolean vazia(){
        return ultimo == null;
    }

    //ADICIONAR ELEMENTOS NA PILHA
    public void inserir(Animes manga){
        No no = new No(manga);
        no.manga = manga;
        no.proximo = ultimo;
        ultimo = no;
        tamanho++;
        System.out.println("Inserido " + manga.nome + " com " + manga.numeroPaginas + " páginas");
    }

    //RETIRAR ELEMENTOS DA PILHA
    public Animes retirar(){
        if (vazia()) {
            return null;
        }
        Animes aux = ultimo.manga;
        ultimo = ultimo.proximo;
        return aux;
    }

}
