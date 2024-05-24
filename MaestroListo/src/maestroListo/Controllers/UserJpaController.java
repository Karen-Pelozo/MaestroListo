package maestroListo.Controllers;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import maestroListo.model.User;
public class UserJpaController {
    private final EntityManagerFactory factoryUser;
    private EntityManager managerUser;
    public UserJpaController() {
        this.factoryUser = Persistence.createEntityManagerFactory("MaestroListo_MaestroListo_jar_0.0.1-SNAPSHOTPU");
    }
    public UserJpaController(EntityManagerFactory emf){
        this.factoryUser = emf;
    }
    public EntityManager getEntityManager(){
        return factoryUser.createEntityManager();
    }
    //CREO UN USUARIO EN BD
     public void crearUserBD(User usuario){
        try{
         managerUser = this.getEntityManager();
         managerUser.getTransaction().begin();//abre la operacion de transaccione entre la bd
         managerUser.persist(usuario);
         managerUser.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO SE PUDO REALIZAR UNA TRANSACCION DE USUARIO");
            managerUser.close();
        }
     }
    //ACTUALIZAR USUARIO 
     public void actualizarUserBD(User user){
         try{
             managerUser.getTransaction().begin();
             managerUser.merge(user);
             managerUser.getTransaction().commit();
         }catch(Exception e){
              JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR ");
              managerUser.close();
         }
     }
     //BUSCO UN USUARIO (RETORNO EL PRIMER USUARIO QUE ENCUENTRO)
      public User busquedaUserBD(Integer id){
          return managerUser.find(User.class,id);
      }
     //ELIMINO UN USUARIO DE LA BASE DE DATOS 
      public void eliminoUserBD(Integer id){
      try{
          User userDelete = managerUser.find(User.class, id);
          managerUser.getTransaction().begin();
          managerUser.remove(userDelete);
          managerUser.getTransaction().commit();
          }catch(Exception e){
           JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL USUARIO");
              managerUser.close();
          }
      }
    //VERIFICAR SI EXISTE UN USUARIO
     public boolean existeUserBD(Integer id){
         return managerUser.find(User.class, id)!=null;
     }
}
