import javax.naming.Context;
import javax.naming.InitialContext;

import org.omg.CORBA.ORB;

import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import servants.BanqueServiceImpl;

public class ServeurCorba {
		
	public static void main(String[] args){
		
		try {
			ORB orb=ORB.init(args, null);
			POA rootPOA=POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootPOA.the_POAManager().activate();
			BanqueServiceImpl od=new BanqueServiceImpl();
			Context ctx=new InitialContext();
			ctx.rebind("BANQUE", rootPOA.servant_to_reference(od));
			orb.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
