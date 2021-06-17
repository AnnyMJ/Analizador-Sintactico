package clases;

public class pila {
    private Nodo ultimoValor;
    
    public pila() {
        ultimoValor = null;
    }
    
    public void Insertar(char valor){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;
      
        if (ultimoValor == null) {
            nuevo_nodo.siguiente = null;
            ultimoValor = nuevo_nodo;
        } else {
            nuevo_nodo.siguiente = ultimoValor;
            ultimoValor = nuevo_nodo;
        }
    }
    
    public char extraer() {
        if (ultimoValor != null) {
            char informacion = ultimoValor.informacion;
            ultimoValor = ultimoValor.siguiente;
            return informacion;
        } else {
            return Character.MAX_VALUE;
        }
    }
    
    public boolean pilaVacia() {
        return ultimoValor == null;
    }
}

