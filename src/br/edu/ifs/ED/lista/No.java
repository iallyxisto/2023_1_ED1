package br.edu.ifs.ED.lista;

public class No<T> {
    public T dado;

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getAnterior() {

        return anterior;
    }

    public void setAnterior(No anterior){
        this.anterior = anterior;
    }

    public No anterior;

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No prox;
}
