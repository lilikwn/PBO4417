/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAOUsers;
import mvc.Model.User;
import mvc.Model.TabelModelUser;
import mvc.View.FormAdmin;
import mvc.View.FormUser;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IUsers;
/**
 *
 * @author ASUS
 */
public class ControllerUser {
    FormUser frameUser;
    IUsers implUser;
    public ControllerUser(FormUser frame){
        this.frameUser = frame;
        implUser = new DAOUsers();
    }
    public void insert(){
        if(!frameUser.getTxtIdentitas().getText().trim().isEmpty()& !frameUser.getTxtNama().getText().trim().isEmpty()){
            User u = new User();
            u.setIdentitas(frameUser.getTxtIdentitas().getText());
            u.setNama(frameUser.getTxtNama().getText());
            u.setJk(frameUser.getTxtJk().getSelectedItem().toString());
            u.setAlamat(frameUser.getTxtAlamat().getText());
            u.setUsia(Integer.parseInt(frameUser.getTxtUmur().getText()));
            u.setAlasan(frameUser.getTxtAlasan().getText());
            implUser.insert(u);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frameUser, "Data Tidak Boleh Kosong");
        }
    }
    public void reset(){
        frameUser.getTxtIdentitas().setText("");
        frameUser.getTxtNama().setText("");
        frameUser.getTxtJk().setSelectedItem("");
        frameUser.getTxtAlamat().setText("");
        frameUser.getTxtUmur().setText("");
        frameUser.getTxtAlasan().setText("");
    }
}
