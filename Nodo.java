
public class Nodo {
    public int dato;
    public Nodo siguiente;
   
    public Nodo(int dato){
        this.dato = dato;
    }
   
    public Nodo(int dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    Nodo(String elemento, Nodo inicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}