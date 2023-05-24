package br.edu.ifs.ED.lista;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T>{
    No<T> comeco;
    No<T> fim;
    public int tamanho;

    public ListaDupEnc(){

        comeco= null;
        fim= null;
        tamanho =0;


    }
    @Override
    public void incluir(T elemento) throws Exception {
        No<T> nvNo = new No<>();
        nvNo.setDado(elemento);
        nvNo.setProx(null);
        nvNo.setAnterior(fim);

        if (comeco == null) {
            comeco = nvNo;

        }

        if (fim != null) {
            fim.setProx(nvNo);
        }
        fim = nvNo;
        tamanho++;

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        No <T> nvNo = new No<>();
        nvNo.setDado(elemento);
        if(comeco== null){
            comeco = nvNo;
            fim = nvNo;
        }
        else{
            comeco.setAnterior(nvNo);
            nvNo.setProx(comeco);
            comeco = nvNo;

        }
        tamanho++;

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if (posicao < 0 || posicao > tamanho) {
            throw new Exception("Posição inválida");
        } else if (posicao == 0 ){
            incluirInicio(elemento);

        }if ( posicao == tamanho) {
            incluir(elemento);
        }
        No<T> nvNo = new No<>();
        nvNo.setDado(elemento);
        No<T> nvNoAnterior = comeco;


        for (int i = 0; i < posicao-1; i++) {

            nvNoAnterior = nvNoAnterior.getProx();

        }

        No<T> nvNoProximo = nvNoAnterior.getProx();
        nvNoAnterior.setProx(nvNo);
        nvNo.setAnterior(nvNoAnterior);
        nvNo.setProx(nvNoProximo);
        nvNoProximo.setAnterior(nvNo);
        tamanho++;


    }

    @Override
    public T get(int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return Integer.MIN_VALUE;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ");

        No<T> atual = comeco;
        while (atual != null) {
            builder.append(atual.getDado()).append("");
            if (atual.prox != null) {
                builder.append(", ");
            }
            atual = atual.getProx();
        }

        builder.append(" ");
        return builder.toString();
    }
    @Override
    public Lista<T> subLista(int posInicial, int posFinal) throws Exception {
        if (posInicial < 0 || posInicial > tamanho || posFinal >= tamanho || posInicial > posFinal) {
            throw new Exception("Intervalo inválido");
        }

        Lista<T> subLista = new ListaDupEnc<>();
        No<T> atual = comeco;
        int pos = 0;

        while (pos < posInicial) {
            atual = atual.prox;
            pos++;
        }

        while (pos <= posFinal) {
            subLista.incluir(atual.dado);
            atual = atual.prox;
            pos++;
        }
        System.out.println(subLista);
        return subLista;
    }


}
