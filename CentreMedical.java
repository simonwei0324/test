package centremedical;

public class CentreMedical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Symptome s1 = new Symptome("Yeux Rouges");
		
		Symptome s2 = new Symptome("Toux");
		
		Symptome s3 = new Symptome ("Grosse Fatigue");
		
		Patient durand = new Patient("PO1", "Durand", "Lucie");
		Patient daniel = new Patient("PO2", "Daniel", "Jacques");
		Patient tresMalade = new Patient("PO3", "Urga", "Ieva");
		
		
		Medecin jeanluc = new Medecin("Pellegrin", "JeanLuc", "cardiologie");
		Medecin jeanne = new Medecin("Pierti", "Jeanne", "medecine interne");
		
		System.out.println(durand.toString());
		System.out.println(daniel.toString());
		System.out.println(tresMalade.toString());
		
		durand.getListeSymptomes().add(s1);
		durand.getListeSymptomes().add(s2);
		
		daniel.getListeSymptomes().add(s3);
		
		
		jeanluc.ajoutPatient(daniel);
		jeanluc.ajoutPatient(durand);
		jeanne.ajoutPatient(tresMalade);
		
		
		System.out.println(jeanluc.toString());
		





		

	}

}
