import javax.naming.Context;
import javax.naming.InitialContext;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemote;
import corbaBanque.IBanqueRemoteHelper;


public class ClientCorba {
	public static void main(String[] args){
		try {
			Context ctx=new InitialContext();
			Object ref=ctx.lookup("BANQUE");
			IBanqueRemote stub=IBanqueRemoteHelper.narrow((org.omg.CORBA.Object)ref);
			System.out.println(stub.conversion(50));
			Compte cp=stub.getCompte(2);
			System.out.println("code ="+cp.code);
			System.out.println("solde ="+cp.solde);
			Compte[] cptes=stub.getComptes();
			for(Compte c:cptes){
				System.out.println(c.code+"--"+c.solde);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
