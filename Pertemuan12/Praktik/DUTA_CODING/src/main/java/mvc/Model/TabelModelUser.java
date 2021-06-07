/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS
 */
public class TabelModelUser extends AbstractTableModel{
    List<User> lu;
    
    public TabelModelUser(List<User> lu){
        this.lu = lu;
    }
    
    @Override
    public int getColumnCount(){
        return 7;
    }
    
    public int getRowCount(){
        return lu.size();
    }
    
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "ID";
            case 1:
                return "NIK/KK";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Usia";
            case 6:
                return "Alasan";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column){
        switch (column){
            case 0:
                return lu.get(row).getId();
            case 1:
                return lu.get(row).getIdentitas();
            case 2:
                return lu.get(row).getNama();
            case 3:
                return lu.get(row).getJk();
            case 4:
                return lu.get(row).getAlamat();
            case 5:
                return lu.get(row).getUsia();
            case 6:
                return lu.get(row).getAlasan();
            default:
                return null;
        }
    }
}
