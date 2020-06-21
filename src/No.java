public class No {

    private No anterior;
    private Object elemento ;

    public No(No anterior, Object elemento) {
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public No(Object elemento) {
        this.elemento = elemento;
    }

    public No getAnterior() {
        return anterior;
    }
 
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

}
