package servidor;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class IniciarServidor {
    public static void main(String[] args) {
        try{
            System.out.println("Iniciando servidor...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/CalculadoraRMI", new Calculadora());          
        } catch(RemoteException re) {
            System.out.println("Erro remoto: " + re.toString());
        } catch(Exception e) {
            System.out.println("Erro local: " + e.toString());
        }
    }
}
