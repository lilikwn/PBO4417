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
public class ControllerAdmin {
    FormAdmin frameAdmin;
    FormUser frameUser;
    IUsers implUser;
    List<User> lu;
    
    public ControllerAdmin(FormAdmin frame){
        this.frameAdmin = frame;
        implUser = new DAOUsers();
        lu = implUser.getAll();
    }
    
    
    public void reset(){
        frameAdmin.getTxtID().setText("");
        frameAdmin.getTxtIdentitas().setText("");
        frameAdmin.getTxtNama().setText("");
        frameAdmin.getTxtJk().setSelectedItem("");
        frameAdmin.getTxtAlamat().setText("");
        frameAdmin.getTxtUmur().setText("");
        frameAdmin.getTxtAlasan().setText("");
    }
    public void isiTable(){
        lu = implUser.getAll();
        TabelModelUser tmb = new TabelModelUser(lu);
        frameAdmin.getTabelData().setModel(tmb);
    }
    public void isiField(int row){
        frameAdmin.getTxtID().setText(lu.get(row).getId().toString());
        frameAdmin.getTxtIdentitas().setText(lu.get(row).getIdentitas());
        frameAdmin.getTxtNama().setText(lu.get(row).getNama());
        frameAdmin.getTxtJk().setSelectedItem(lu.get(row).getJk());
        frameAdmin.getTxtAlamat().setText(lu.get(row).getAlamat());
        frameAdmin.getTxtUmur().setText(lu.get(row).getUsia().toString());
        frameAdmin.getTxtAlasan().setText(lu.get(row).getAlasan());
    }
    public void insert(){
        if(!frameAdmin.getTxtIdentitas().getText().trim().isEmpty()& !frameAdmin.getTxtNama().getText().trim().isEmpty()){
            User u = new User();
            u.setIdentitas(frameAdmin.getTxtIdentitas().getText());
            u.setNama(frameAdmin.getTxtNama().getText());
            u.setJk(frameAdmin.getTxtJk().getSelectedItem().toString());
            u.setAlamat(frameAdmin.getTxtAlamat().getText());
            u.setUsia(Integer.parseInt(frameAdmin.getTxtUmur().getText()));
            u.setAlasan(frameAdmin.getTxtAlasan().getText());
            implUser.insert(u);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frameAdmin, "Data Tidak Boleh Kosong");
        }
    }
    public void update(){
        if(!frameAdmin.getTxtIdentitas().getText().trim().isEmpty()& !frameAdmin.getTxtNama().getText().trim().isEmpty()){
            User u = new User();
            u.setId(Integer.parseInt(frameAdmin.getTxtID().getText()));
            u.setIdentitas(frameAdmin.getTxtIdentitas().getText());
            u.setNama(frameAdmin.getTxtNama().getText());
            u.setJk(frameAdmin.getTxtJk().getSelectedItem().toString());
            u.setAlamat(frameAdmin.getTxtAlamat().getText());
            u.setUsia(Integer.parseInt(frameAdmin.getTxtUmur().getText()));
            u.setAlasan(frameAdmin.getTxtAlasan().getText());
            implUser.update(u);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frameAdmin, "Pilih data yang akan di ubah");
        }
    }
    public void delete(){
        if(!frameAdmin.getTxtID().getText().trim().isEmpty()){
            String id = frameAdmin.getTxtID().getText();
            implUser.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        }else {
            JOptionPane.showMessageDialog(frameAdmin, "Pilih Data yang akan di hapus");
        }
    }
    public void isiTableCariNama(){
        lu = implUser.getCariNama(frameAdmin.getTxtCariNama().getText());
        TabelModelUser tmb = new TabelModelUser(lu);
        frameAdmin.getTabelData().setModel(tmb);
    }
    public void carinama(){
        implUser.getCariNama(frameAdmin.getTxtCariNama().getText());
        isiTableCariNama();
    }
}
