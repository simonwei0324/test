package centremedical;
import java.util.ArrayList;
import java.util.Iterator;


public class Medecin {
	
	private String nomMedecin;
	private String prenomMedecin;
	private String specialite;
	private ArrayList<Patient> listePatients = new ArrayList();
	
	// Getters & Setters
	/**
	 * @return the nomMedecin
	 */
	public String getNomMedecin() {
		return nomMedecin;
	}
	/**
	 * @param nomMedecin the nomMedecin to set
	 */
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	/**
	 * @return the prenomMedecin
	 */
	public String getPrenomMedecin() {
		return prenomMedecin;
	}
	/**
	 * @param prenomMedecin the prenomMedecin to set
	 */
	public void setPrenomMedecin(String prenomMedecin) {
		this.prenomMedecin = prenomMedecin;
	}
	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	/**
	 * @return the listePatients
	 */
	public ArrayList<Patient> getListePatients() {
		return listePatients;
	}
	/**
	 * @param listePatients the listePatients to set
	 */
	public void setListePatients(ArrayList<Patient> listePatients) {
		this.listePatients = listePatients;
	}
	
	//Constructeur 
	
	/**
	 * @param nomMedecin
	 * @param prenomMedecin
	 * @param specialite
	 */
	public Medecin(String nomMedecin, String prenomMedecin, String specialite) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.specialite = specialite;
	}
	
	
	/**
	 * @param nomMedecin
	 * @param prenomMedecin
	 * @param specialite
	 * @param listePatients
	 */
	public Medecin(String nomMedecin, String prenomMedecin, String specialite, ArrayList<Patient> listePatients) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.specialite = specialite;
		this.listePatients = listePatients;
	}
	
	public String toString() {
		
		String mesPatients = "";
		
		Iterator<Patient> it = this.getListePatients().iterator();
		while (it.hasNext()) {
			mesPatients += it.next().getNomPatient() + " ";
		}
		return "Nom Med: " + this.getNomMedecin() + "\n Prenom " + this.getPrenomMedecin() + "\n liste Patients " + mesPatients;
	}
	
	public void ajoutPatient(Patient p) {
		if (!this.getListePatients().contains(p)) {
			this.getListePatients().add(p);
		}
	}
	
	}
			


