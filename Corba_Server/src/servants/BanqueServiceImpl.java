package servants;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemotePOA;

public class BanqueServiceImpl extends IBanqueRemotePOA {

	@Override
	public double conversion(double mt) {
		// TODO Auto-generated method stub
		return mt*11.3;
	}

	@Override
	public Compte getCompte(int code) {
		// TODO Auto-generated method stub
		return new Compte(code, Math.random()*9000);
	}

	@Override
	public Compte[] getComptes() {
		Compte[] cptes=new Compte[3];
		cptes[0]=new Compte(1, Math.random()*9000);
		cptes[1]=new Compte(2, Math.random()*8000);
		cptes[2]=new Compte(3, Math.random()*5000);
		return cptes;
	}

}
