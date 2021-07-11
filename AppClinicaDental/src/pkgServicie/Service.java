/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;

/**
 *
 * @author Erick
 */
public class Service {
    private int idServicio;
    private String nombre, precio, enableString;
    private boolean enable;
    
//    private Service servicio;
//   
//    public Service getServicio() {
//        return servicio;
//    }
//
//    public void setServicio(Service servicio) {
//        this.servicio = servicio;
//    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
    public int isEnable() { //Funcion que trabaja con el valor inicial true 
        if (enable == true) {   // en el boolean para poder agregar un nuevo servicio
            enableString = "True";
            return 1;
        }
        else enableString = "False";
        return 0;
       
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
      
           
}
