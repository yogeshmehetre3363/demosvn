package flentas.senp.updatelan.dto;


import org.springframework.stereotype.Component;

@Component
public class GstinList
{
    private Boolean extendedPeriod;

    private String mobile;

    
    private String gstin;

    
    private String email;

    private String customerName;

    public Boolean getExtendedPeriod ()
    {
        return extendedPeriod;
    }

    public void setExtendedPeriod (Boolean extendedPeriod)
    {
        this.extendedPeriod = extendedPeriod;
    }

    public String getMobile ()
    {
        return mobile;
    }

    public void setMobile (String mobile)
    {
        this.mobile = mobile;
    }

    public String getGstin ()
    {
        return gstin;
    }

    public void setGstin (String gstin)
    {
        this.gstin = gstin;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getCustomerName ()
    {
        return customerName;
    }

    public void setCustomerName (String customerName)
    {
        this.customerName = customerName;
    }

	@Override
	public String toString() {
		return "GstinList [extendedPeriod=" + extendedPeriod + ", mobile=" + mobile + ", gstin=" + gstin + ", email="
				+ email + ", customerName=" + customerName + "]";
	}
    
    
    
}