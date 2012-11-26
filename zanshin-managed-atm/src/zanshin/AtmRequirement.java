package zanshin;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public enum AtmRequirement {
	/** TODO: document this field. */
	T_SET_UP_CONNECT("TSetUpConnect"),

	/** TODO: document this field. */
	T_PRINT_RECEIPT("TPrintReceipt"),

	/** TODO: document this field. */
	G_DETECT_CASH_AM("GDetectCashAm"),

	/** TODO: document this field. */
	AR3("AR3"),
	
	/** Number of operators available */
	
	NOA("NOA");
	

	/** TODO: document this field. */
	private String name;

	/** Constructor. */
	private AtmRequirement(String name) {
		this.name = name;
	}

	/** Getter for name. */
	public String getName() {
		return name;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param reqName
	 * @return
	 */
	public boolean matches(String reqName) {
		return name.toLowerCase().equals(reqName.toLowerCase());
	}

	/** @see java.lang.Enum#toString() */
	@Override
	public String toString() {
		return name;
	}
}
