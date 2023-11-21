package flentas.senp.updatelan.dto;

import java.util.Arrays;

import org.springframework.stereotype.Component;

//simulate data

	@Component
	public class SimulateData
	{
	    private Boolean simulateEnable;

	    private String[] inclusiveReports;

	    public Boolean getSimulateEnable ()
	    {
	        return simulateEnable;
	    }

	    public void setSimulateEnable (Boolean simulateEnable)
	    {
	        this.simulateEnable = simulateEnable;
	    }

	    public String[] getInclusiveReports ()
	    {
	        return inclusiveReports;
	    }

	    public void setInclusiveReports (String[] inclusiveReports)
	    {
	        this.inclusiveReports = inclusiveReports;
	    }

		@Override
		public String toString() {
			return "SimulateData [simulateEnable=" + simulateEnable + ", inclusiveReports="
					+ Arrays.toString(inclusiveReports) + "]";
		}
	    
	    
	}