package eu.europa.esig.dss.pades.extension.suite;

public class PAdESExtensionLTToLTAWithSelfSignedTest extends PAdESExtensionLTToLTATest {

	@Override
	protected String getSigningAlias() {
		return SELF_SIGNED_USER;
	}

}