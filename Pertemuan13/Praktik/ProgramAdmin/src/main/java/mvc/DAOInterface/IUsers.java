/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.User;
/**
 *
 * @author ASUS
 */
public interface IUsers {
    public void insert(User u);
    public void update(User u);
    public void delete(String identitas);
    public List<User> getAll();
    public List<User> getCariNama(String nama);
}
