package main;

public class Main {
    public static void main(String[] args){
        ListaLigada personas = insertarPersonas();
        NodoDoble actual = personas.getActual();
        boolean adelante = true;
        boolean salta = false;
        int numero = 1;

        while (numero<=100){

            //Persona dice el numero
            System.out.println("Persona "+actual.getDato()+ "-> " +numero);

            //Analizamos si el número corresponde a un cambio de dirección
            if (numero%7==0){
                System.out.println("Cambio de dirección!!  ");
                adelante = adelante? false: true;
            }
            //Analizamos si el número corresponde a saltar una persona
            if (numero%11==0){
                System.out.println("saltamos al siguiente!!  ");
                salta=true;
            }

            //Se realizan las acciones de acuerdo al numero, es decir, se salta si es el caso o se cambia de direccion
            if (adelante){
                if (salta){
                    actual = actual.getSiguiente().getSiguiente();
                    salta=false;
                }else{
                    actual=actual.getSiguiente();
                }

            }
            else {
                if (salta){
                    actual = actual.getAnterior().getAnterior();
                    salta= false;
                }else {
                    actual=actual.getAnterior();
                }
            }

            //Se aumenta el número
            numero++;
        }
    }

    public static ListaLigada insertarPersonas(){
        ListaLigada personas = new ListaLigada();
        personas.insertar(1);
        personas.insertar(2);
        personas.insertar(3);
        personas.insertar(4);
        personas.insertar(5);
        personas.insertar(6);
        personas.insertar(7);
        personas.insertar(8);
        personas.insertar(9);
        personas.insertar(10);
        personas.imprimir ();
        personas.setActual(personas.getRaiz());
        return personas;
    }
}
