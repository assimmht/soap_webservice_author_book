/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auhorbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author assim
 */
@WebService(serviceName = "WebServer")
public class WebServer {
    Connection con = DBConnection.serverConnect();

      /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "insert")
    public void insert(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "lastname") String lastname) {

         try {
           String sq="INSERT INTO `author`(`id`, `name`, `lastname`) VALUES ('"+id+"','"+name+"','"+lastname+"')";
           PreparedStatement pst=con.prepareStatement(sq);
           pst.execute();
        //   update();
        } catch (Exception e) {
          // JOptionPane.showMessageDialog(rootPane, e);
        }
     
    }
    
    @WebMethod(operationName = "update")
    public void update(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "lastname") String lastname) {

        try {
            String squpdate = "UPDATE author SET name='"+name+"',lastname='"+lastname+"' where id='"+id+"'";
            PreparedStatement pst=con.prepareStatement(squpdate);
            pst.execute();
        } catch (Exception e) {
        }      
  
    }
    
    @WebMethod(operationName = "delete")
    public void delete(@WebParam(name = "id") int id) {

        try {
         
            String sql="DELETE FROM author where id='"+ id +"'";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
         
        } catch (Exception e) {
        }        
     
    }
    
    @WebMethod(operationName = "insertlivre")
    public void insertlivre(@WebParam(name = "id") int id, @WebParam(name = "title") String title, @WebParam(name = "isbn") String isbn, 
                            @WebParam(name = "id_author") int id_author) {

         try {
           String sq="INSERT INTO `book`(`id`, `title`, `isbn`, `id_author`) VALUES ('"+id+"','"+title+"','"+isbn+"','"+id_author+"')";
           PreparedStatement pst=con.prepareStatement(sq);
           pst.execute();
        //   update();
        } catch (Exception e) {
          // JOptionPane.showMessageDialog(rootPane, e);
        }
     
    }
    
     @WebMethod(operationName = "updatelivre")
    public void updatelivre(@WebParam(name = "id") int id, @WebParam(name = "title") String title, @WebParam(name = "isbn") String isbn, 
                            @WebParam(name = "id_author") int id_author){

        try {
            String squpdate = "UPDATE book SET title='"+title+"',isbn='"+isbn+"',id_author='"+id_author+"' where id='"+id+"'";
            PreparedStatement pst=con.prepareStatement(squpdate);
            pst.execute();
        } catch (Exception e) {
        }      
  
    }
    
      @WebMethod(operationName = "deletelivre")
    public void deletelivre(@WebParam(name = "id") int id) {

        try {
         
            String sql="DELETE FROM book where id='"+ id +"'";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
         
        } catch (Exception e) {
        }        
     
    }
    
}
