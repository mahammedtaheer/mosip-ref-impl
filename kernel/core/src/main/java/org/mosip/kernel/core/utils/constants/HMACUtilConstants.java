package org.mosip.kernel.core.utils.constants;

public enum HMACUtilConstants {
	MOSIP_NO_SUCH_ALGORITHM_ERROR_CODE("COK-UTL-HMA-001","No such algorithm for the input");
	
	public final String errorCode;
	public final String errorMessage;

	HMACUtilConstants(String string1,String string2) {
		this.errorCode = string1;
		this.errorMessage = string2;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
