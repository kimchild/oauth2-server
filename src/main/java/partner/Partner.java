package partner;

public class Partner {

	private String domain;
	private String redirectUrl;

	Partner(String domain, String redirectUrl) {
		this.domain = domain;
		this.redirectUrl = redirectUrl;
	}

	public String getDomain() {
		return domain;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

}
