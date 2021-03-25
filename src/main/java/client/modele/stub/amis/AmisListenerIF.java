package client.modele.stub.amis;

import client.modele.serveur.stub.amis.chat.Message;
import client.modele.serveur.stub.connexion.joueur.JoueurProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AmisListenerIF extends Remote {

    public abstract void recupererMessage(String de, Message message) throws RemoteException;

    public abstract void recupererAmis(JoueurProxy joueurProxy) throws RemoteException;
    public abstract void supprimerAmis(JoueurProxy joueurProxy) throws RemoteException;
    public abstract void recupererDemande(JoueurProxy joueurProxy) throws RemoteException;

    public abstract void actualiserEtat(String pseudo, boolean etat) throws RemoteException;

}