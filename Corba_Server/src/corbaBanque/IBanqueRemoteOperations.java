package corbaBanque;


/**
* corbaBanque/IBanqueRemoteOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Wednesday, January 17, 2018 1:09:59 PM EST
*/

public interface IBanqueRemoteOperations 
{
  double conversion (double mt);
  corbaBanque.Compte getCompte (int code);
  corbaBanque.Compte[] getComptes ();
} // interface IBanqueRemoteOperations
