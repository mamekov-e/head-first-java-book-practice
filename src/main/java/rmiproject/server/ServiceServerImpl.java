package rmiproject.server;

import rmiproject.services.DayOfTheWeekService;
import rmiproject.services.DiceService;
import rmiproject.services.MiniMusicService;
import rmiproject.services.Service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {

    HashMap serviceList;

    public ServiceServerImpl() throws RemoteException {
        setUpService();
    }

    public static void main(String[] args) {
        try {
            Naming.bind("ServiceServer", new ServiceServerImpl());
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("Remote Service is running...");
    }

    private void setUpService() {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling Service", new DiceService());
        serviceList.put("Mini Music Service", new MiniMusicService());
        serviceList.put("Day Of the Week Service", new DayOfTheWeekService());
    }

    @Override
    public Object[] getServiceList() throws RemoteException {
        System.out.println("In remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        return (Service) serviceList.get(serviceKey);
    }
}
