package flentas.senp.updatelan.dto;

import org.springframework.stereotype.Component;

//additional contact
	@Component
	public class AdditionalContact
	{
	    private String mobile;

	    private String email;

	    public String getMobile ()
	    {
	        return mobile;
	    }

	    public void setMobile (String mobile)
	    {
	        this.mobile = mobile;
	    }

	    public String getEmail ()
	    {
	        return email;
	    }

	    public void setEmail (String email)
	    {
	        this.email = email;
	    }

	}
	