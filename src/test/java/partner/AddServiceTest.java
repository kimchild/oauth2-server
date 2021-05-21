package partner;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AddServiceTest {

	@Test
		// @checkstyle:off
	void 서비스등록_테스트() {
		// @checkstyle:on
		final String domain = "domain_url";
		final String redirectUrl = "redirect_url";
		AddService addService = new AddService();
		addService.add(domain, redirectUrl);

		assertThat(addService.find(domain).getRedirectUrl()).isEqualTo(redirectUrl);
	}
}
