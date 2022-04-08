
package Ej_8_Poo_02_Movimientos;


public class ObjetoMovil {
    private int coordenadaX;
    private int coordenadaY;

    public ObjetoMovil(int coordenadaX, int coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void setCoordenadaX(int coordenadaX){
        this.coordenadaX = coordenadaX;
    }
    public int getCoordenadaX(){
        return this.coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY){
        this.coordenadaY = coordenadaY;
    }
    public int getCoordenadaY(){
        return this.coordenadaY;
    }
    
    @Override
    public String toString(){
        return "Coordenada X: "+this.coordenadaX +"\nCoordenada Y: "+this.coordenadaY;
    }

    public String obtenerPosicion(String coordenadas){
        String mensaje ="";
        switch(coordenadas.toLowerCase()){
            case "izquierda": this.coordenadaX --   ; break;
            case "derecha"  : this.coordenadaX ++   ; break;
            case "arriba"   : this.coordenadaY ++   ; break;
            case "abajo"    : this.coordenadaY --   ; break;
            default: return "Se equivoco de opcion";
        }
        return "X: "+this.coordenadaX+"\nY: "+this.coordenadaY;
    }

}
