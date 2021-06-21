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
    private String NameofService, price, enableString;
    private boolean enable;
    private Service servicio;
    
   
    public Service getServicio() {
        return servicio;
    }

    public void setServicio(Service servicio) {
        this.servicio = servicio;
    }

    public String getNameofService() {
        return NameofService;
    }

    public void setNameofService(String NameofService) {
        this.NameofService = NameofService;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
