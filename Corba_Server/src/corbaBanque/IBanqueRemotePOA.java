package corbaBanque;


/**
* corbaBanque/IBanqueRemotePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Wednesday, January 17, 2018 1:09:58 PM EST
*/

public abstract class IBanqueRemotePOA extends org.omg.PortableServer.Servant
 implements corbaBanque.IBanqueRemoteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("conversion", new java.lang.Integer (0));
    _methods.put ("getCompte", new java.lang.Integer (1));
    _methods.put ("getComptes", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // corbaBanque/IBanqueRemote/conversion
       {
         double mt = in.read_double ();
         double $result = (double)0;
         $result = this.conversion (mt);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // corbaBanque/IBanqueRemote/getCompte
       {
         int code = in.read_long ();
         corbaBanque.Compte $result = null;
         $result = this.getCompte (code);
         out = $rh.createReply();
         corbaBanque.CompteHelper.write (out, $result);
         break;
       }

       case 2:  // corbaBanque/IBanqueRemote/getComptes
       {
         corbaBanque.Compte $result[] = null;
         $result = this.getComptes ();
         out = $rh.createReply();
         corbaBanque.cptesHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corbaBanque/IBanqueRemote:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IBanqueRemote _this() 
  {
    return IBanqueRemoteHelper.narrow(
    super._this_object());
  }

  public IBanqueRemote _this(org.omg.CORBA.ORB orb) 
  {
    return IBanqueRemoteHelper.narrow(
    super._this_object(orb));
  }


} // class IBanqueRemotePOA
