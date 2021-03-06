package com.nylas;

/**
 * An Account as managed by the Accounts access object for a particular application client_id.
 */
public class Account extends AccountOwnedModel {

	private String billing_state;
	private String email;
	private String provider;
	private String sync_state;
	private Boolean trial;
	
	public String getBillingState() {
		return billing_state;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public String getSyncState() {
		return sync_state;
	}
	
	public Boolean getTrial() {
		return trial;
	}

	@Override
	public String toString() {
		return "Account [id=" + getId() + ", billing_state=" + billing_state + ", email=" + email + ", provider=" + provider
				+ ", sync_state=" + sync_state + ", trial=" + trial + "]";
	}
	
}
