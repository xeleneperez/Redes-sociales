package sbc;

public class ingresar {
   
    private String comentario;
    private String reaccionar;


    public ingresar(String comentario, String reaccionar) {
        this.comentario = comentario;
        this.reaccionar =reaccionar;
    }
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getReaccionar() {
        return reaccionar;
    }
    public void setReaccionar(String reaccionar) {
        this.reaccionar = reaccionar;
    }
    
    public String ingresarcomentario(){
        String comentario="su comentario fue "+getComentario()+"la reaccion de su comentario"+getReaccionar();
        return comentario;
    }
    
    
    

}
