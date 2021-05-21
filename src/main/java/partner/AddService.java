package partner;

import java.util.ArrayList;
import java.util.List;

public class AddService {

	List<Partner> partnerList = new ArrayList<>();

	public void add(String domainUrl, String redirectUrl) {
		partnerList.add(new Partner(domainUrl, redirectUrl));
	}

	public Partner find(String domain) {
		int index = 0;
		Partner partner = null;
		while (isPartner(index, partner, domain)) {
			partner = partnerList.get(index++);
		}
		return partner;
	}

	private boolean isPartner(int index, Partner partner, String domain) {
		return index <= partnerList.size()
			&& (partner == null || !partner.getDomain().equals(domain));
	}
}
