package org.apache.maven.archetypes.maven_archetype_quickstart;

/**
 * Hello world!
 *
 */
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;
import AllegroWebApi.AllegroWebApiPortType;
import AllegroWebApi.AllegroWebApiService;
import AllegroWebApi.AllegroWebApiServiceLocator;




public class AllegroTest {
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  AllegroWebApiService allegroWebApiService = new AllegroWebApiServiceLocator();
  try {
   AllegroWebApiPortType allegro = allegroWebApiService.getAllegroWebApiPort();
   String userLogin = "login allegro"; //tutaj login allegro
   String userPassword = "haslo allegro"; //tutaj hasło allegro
   int countryCode = 1; //kod kraju - dostajemy go razem z kluczem webapi 
   String webapiKey = "xxx"; //klucz webapi
   long localVersion = 333; //klucz wersji 
   StringHolder sessionHandlePart = new StringHolder(); //tutaj znajdzie sie id sesji po zalogowaniu
   LongHolder userId = new LongHolder(); //tutaj znajdzie sie nasz identyfikator
   LongHolder serverTime = new LongHolder(); //czas
   allegro.doLogin(userLogin, userPassword, countryCode, webapiKey, localVersion, sessionHandlePart, userId, serverTime);
   //jesli nie wyskoczy zaden exception, to znaczy, że logowanie sie udalo...
   //to wyświetlmy kilka danych
   System.out.println("Id: "+userId.value);
   System.out.println("identyfikator sesji: "+sessionHandlePart.value);
   
  } catch (ServiceException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (RemoteException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}