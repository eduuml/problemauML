// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ModelitzarUML.vendes.vendes;

import ModelitzarUML.vendes.vendes.Pedidos;
import java.lang.String;

/************************************************************/
/**
 * 
 */
public class Cliente {
	/**
	 * 
	 */
	private Pedidos[] llistaPedidos;
	/**
	 * 
	 */
	private int idClient;
	/**
	 * 
	 */
	private String nom;
	/**
	 * 
	 */
	private String cognoms;

	/**
	 * 
	 * @return 
	 */
	public Pedidos[] getLlistaPedidos() {

		return llistaPedidos;
	}

	/**
	 * 
	 * @param llistaPedidos 
	 */
	public void setLlistaPedidos(Pedidos[] llistaPedidos) {

		this.llistaPedidos = llistaPedidos;
	}

	/**
	 * 
	 * @return 
	 */
	public int getIdClient() {

		return idClient;
	}

	/**
	 * 
	 * @param idClient 
	 */
	public void setIdClient(int idClient) {

		this.idClient = idClient;
	}

	/**
	 * 
	 * @return 
	 */
	public String getNom() {

		return nom;
	}

	/**
	 * 
	 * @param nom 
	 */
	public void setNom(String nom) {

		this.nom = nom;
	}

	/**
	 * 
	 * @return 
	 */
	public String getCognoms() {

		return cognoms;
	}

	/**
	 * 
	 * @param cognoms 
	 */
	public void setCognoms(String cognoms) {

		this.cognoms = cognoms;
	}
};