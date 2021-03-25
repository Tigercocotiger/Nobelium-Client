package client.modele.stub.salleattente;

import client.modele.serveur.stub.connexion.joueur.JoueurProxy;
import client.modele.serveur.stub.jeux.application.JeuxEnum;
import client.modele.serveur.stub.jeux.connecteur.ConnecteurJeuxIF;
import client.modele.serveur.stub.salleattente.SalleAttenteProprietaireIF;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ListenerSalleAttenteIF extends Remote {

    public abstract void connexionPartie(ConnecteurJeuxIF connecteur, JeuxEnum jeu) throws RemoteException;

    public abstract void designerProprietaire(SalleAttenteProprietaireIF droitProprietaire) throws RemoteException;
    public abstract void changerParametreSalle(String nomParametre, Object valeur) throws RemoteException;
    public abstract void changerParametreJeu(String nomParametre, Object valeur) throws RemoteException;
    public abstract void exclusion() throws RemoteException;

    public abstract  void actualiserJoueur() throws RemoteException ;
    public abstract void recupererMessage(String expediteur, String message) throws RemoteException;

    public abstract void connexionJoueur(JoueurProxy joueur) throws RemoteException;
    public abstract void deconnexionJoueur(String pseudo) throws RemoteException;
    public abstract void changerEtatJoueur(String pseudo, boolean etat) throws RemoteException;

    public abstract void activerPret(boolean active) throws RemoteException;
}