package org.example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException {


                try {
                    MyRemoteService service = new MyRemoteServiceImpl();
                    Registry registry = LocateRegistry.createRegistry(1099);
                    registry.rebind("MyRemoteService", service);
                    System.out.println("RMI Server ready");
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
}