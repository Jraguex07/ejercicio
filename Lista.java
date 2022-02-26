
public class Lista {  
    protected Nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
   
    public void agregarAlInicio(String elemento){
        inicio = new Nodo(elemento,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
   
    public void mostrarLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]->");
            aux=aux.siguiente;
        }
    }   
    public void buscarElemento(String elemento){
        Nodo aux = inicio;
        while (aux !=null){
            
            if(aux.equals(elemento)){
                System.out.println("["+aux.dato+"]");
            
            }else {
                System.out.println("no se encontro el elemento");
            }
            aux = aux.siguiente;
        
        }
    
    
    }
}