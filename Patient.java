package centremedical;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 */

/**
 * @author charlineclain
 *
 */
public class Patient {
	
	// Declaration des membres
	
	private String numMatricule;
	private Date dateNaiss;
	private String nomPatient;
	private String prenomPatient;
	private String adresse;
	private ArrayList<Symptome> listeSymptomes = new ArrayList();
	
	
	//Declaration des get
	/**
	 * @return the numMatricule
	 */
	public String getNumMatricule() {
		return numMatricule;
	}
	/**
	 * @param numMatricule the numMatricule to set
	 */
	public void setNumMatricule(String numMatricule) {
		this.numMatricule = numMatricule;
	}
	/**
	 * @return the dateNaiss
	 */
	public Date getDateNaiss() {
		return dateNaiss;
	}
	/**
	 * @param dateNaiss the dateNaiss to set
	 */
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	/**
	 * @return the nomPatient
	 */
	public String getNomPatient() {
		return nomPatient;
	}
	/**
	 * @param nomPatient the nomPatient to set
	 */
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	/**
	 * @return the prenomPatient
	 */
	public String getPrenomPatient() {
		return prenomPatient;
	}
	/**
	 * @param prenomPatient the prenomPatient to set
	 */
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	/**
	 * @return the listeSymptomes
	 */
	public ArrayList<Symptome> getListeSymptomes() {
		return listeSymptomes;
	}
	/**
	 * @param listeSymptomes the listeSymptomes to set
	 */
	public void setListeSymptomes(ArrayList<Symptome> listeSymptomes) {
		this.listeSymptomes = listeSymptomes;
	}
	//Constructor 
	/**
	 * @param numMatricule
	 * @param dateNaiss
	 * @param nomPatient
	 * @param prenomPatient
	 * @param adresse
	 */
	public Patient(String numMatricule, Date dateNaiss, String nomPatient, String prenomPatient, String adresse) {
		super();
		this.numMatricule = numMatricule;
		this.dateNaiss = dateNaiss;
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.adresse = adresse;
	}
	
	
	
	/**
	 * @param numMatricule
	 * @param nomPatient
	 * @param prenomPatient
	 */
	public Patient(String numMatricule, String nomPatient, String prenomPatient) {
		super();
		this.numMatricule = numMatricule;
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
	}
	
	public String toString() {
		return "Nom: " + this.getNomPatient() + "\n Prenom " + this.getPrenomPatient();
	}
	
	
	
	public void removeSymptome(Symptome symp) {
		if (this.getListeSymptomes().contains(symp)){
			this.getListeSymptomes().remove(symp);
		}
		
	}
	

	
	
	
	

}
