
package pokemonelementos;


public abstract class Pokemon {
    protected String Nombre;
    protected String Elemento;
    protected int Vida;
    protected String Imagen;//creo atributos
    protected int porcentajeDefensa;
    
    public abstract void Atacar();
    public abstract void Defender();
    public abstract void Desacubrir();

    public Pokemon(String Nombre, String Elemento, int Vida, String Imagen, int porcentajeDefensa) {
        this.Nombre = Nombre;
        this.Elemento = Elemento;
        this.Vida = Vida;
        this.Imagen = Imagen;
        this.porcentajeDefensa = porcentajeDefensa;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getPorcentajeDefensa() {
        return porcentajeDefensa;
    }

    public void setPorcentajeDefensa(int porcentajeDefensa) {
        this.porcentajeDefensa = porcentajeDefensa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getElemento() {
        return Elemento;
    }

    public void setElemento(String Elemento) {
        this.Elemento = Elemento;
    }

    public void setVida(byte Vida) {
        this.Vida = Vida;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
    public void mostrarDatos(){
        
    } 
    
}
