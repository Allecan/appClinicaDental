/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author allec
 */
public abstract class FormatDate {

    public String dateFormat(Date date, String format) {
        SimpleDateFormat formato = new SimpleDateFormat(format);
        if (date != null) {
            return formato.format(date);
        }
        return null;
    }

    public String timeFormat(String time, String formatIn, String formatOut) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatIn);
        Date date;
        try {
            date = formatter.parse(time);
            return dateFormat(date, formatOut);
        } catch (ParseException ex) {
            return null;
        }
    }
}
