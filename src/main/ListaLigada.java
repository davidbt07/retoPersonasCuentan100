package main;

public class ListaLigada {
    private NodoDoble raiz;
    private NodoDoble actual;

    public ListaLigada () {
            raiz=null;
            actual=null;
        }

    public void setActual(NodoDoble actual) {
        this.actual = actual;
    }

    public NodoDoble getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDoble raiz) {
        this.raiz = raiz;
    }

    public void insertar(int dato){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setDato(dato);
        if(raiz==null){
            raiz=nuevo;
            raiz.setAnterior(nuevo);
            raiz.setSiguiente(nuevo);
        }else{
            NodoDoble reco = raiz;
            while (reco.getSiguiente()!=raiz){
                reco = reco.getSiguiente();
            }
            reco.setSiguiente(nuevo);
            nuevo.setAnterior(reco);
            nuevo.setSiguiente(raiz);
            raiz.setAnterior(nuevo);
        }
    }

    public void imprimir(){
        NodoDoble reco = raiz;
        while (reco.getSiguiente()!=raiz){
            System.out.print(reco.getDato() + "-");
            reco = reco.getSiguiente();
        }
        System.out.println(reco.getDato());
    }



    public NodoDoble getActual(){
        return actual;
    }
}
