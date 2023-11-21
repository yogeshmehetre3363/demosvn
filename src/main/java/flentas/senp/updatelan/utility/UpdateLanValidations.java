package flentas.senp.updatelan.utility;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import flentas.senp.updatelan.dto.ServicesDto;

@Component
public class UpdateLanValidations {
	
	public boolean checklan_id(String lan_id) {
		if (lan_id == null || lan_id.isEmpty() || lan_id.isBlank()) {
			return true;
		}
		else {
			return false;
		}
		}
	public boolean checkusername(String username) {
		if (username == null || username.isEmpty() || username.isBlank()) {
			return true;
		}
		else {
			return false;
		}
		}
	public boolean checkcif(String cif) {
		if (cif == null || cif.isEmpty() || cif.isBlank()) {
			return true;
		}
		else {
			return false;
		}
	}


}
