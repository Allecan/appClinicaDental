 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgConsultation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import pckgAppointment.Cita;
import pckgAppointment.CitaSQL;
import pkgServicie.ServiceSQL;
/**
 *
 * @author Erick
 */
public class ConsultationManegement {
    private final ServiceSQL sql;
    private final CitaSQL cita;
    
    private ResultSet rs;

    public ConsultationManegement() {
        this.cita = new CitaSQL();
        this.sql = new ServiceSQL();
    }
    
    public DefaultComboBoxModel ListService() throws SQLException{
        rs = sql.SelectServices();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        while(rs.next()){
            modelo.addElement(rs.getString("nombre"));
        }
        return modelo;
    }
    
    public DefaultComboBoxModel ListApointment() throws SQLException {
        List<Cita> citas = cita.selectAllAppoints(0);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String[] datos = new String[4];
        for (int i = 0; i < citas.size(); i++) {
            modelo.addElement(citas.get(i).getFecha());
        }
        return modelo; 
    }
    
    public void getToInsert(String service, String fecha, String hora, String paciente){
        Consultation consul = new Consultation();
        consul.setDate(fecha);
        consul.setTime(hora);
    }
    
}
