/*
* Author : Jothibasu
* Youtube : www.youtube.com/jothibasuofficial
* Blog : jothibasuofficial.blogspot.com
*/
package calculatorrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface CalculatorInterface extends Remote {
    public int add(int x, int y)throws RemoteException;
    public int sub(int x, int y)throws RemoteException;
    public int mul(int x, int y)throws RemoteException;
    public int div(int x, int y)throws RemoteException;
  
}
