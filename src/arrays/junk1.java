package arrays;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class junk1 {
	public static void main(String[] args){
		 String query = "oauth_token=A%3DfxscD8b5jDj.NfYj1O7ei31KcwLG0V911c0E3QvaZf6Kx6_bU5c5ZClEDoBPhfG8PnWgFDofJh4dCbhZPwCtqr4QWqIxSj2uCiyDk7z1S6Jk7cOSup8wAJIcNxFAZF3AYkUlxaHpDYWgTN5OMNuqlNRhpuNXNJ_Hm3ysaDrEwZWsyarBziuAsLrdySHNxGEaJgK0iwXvq_GuYhEZXqE2j5ifFseRfvmXDfJeX6DS9uZKGd7UXjFb8TqwoDBtLtufNvKNO_SgNIQYTC0r6nrb0y5eSgiwAoD.DZxsp74NGdCnrMli3LJ1fJixR8maQ00pAIbOo8cNdAcHbY9deiunh9FEAnMwkmzIM7A7QboKGjx292YpcVnQ0R81XXx_ujK0ecAOWcTikr4R8IZHZ_veCRRLO6PQDRSK9PbNELW0p.2BbqVb6zKZU8dH62AeMKQGtsFiXGhtDGMHR4L4w5.XtHTcw2jFKgAqfKXGwFyJV9yiJiICkLserpBZKL1GwJP5zrdWtjwypmx9QN_dguc_dL5XxpbPiuJN16rBQ0y7rzNp8oqcjwzDiBKXDQS7.ov_wHP72f.M.I4am83aKVb.PK45MsSSdgQYYlZeTsmVAuiUD.gql4acZDQZzfz8cV0KxErOOalaals4DzSCpNBk1j39rpIxUvf8uhXlozTC0QML77wuClrDaIOlc3fHtvHLjF62W3lepW6LbmD3oHCPeIpgvTDwuw4xhxmk3e536LfcUJkK15ZveNmChJppfJ5nocqEkhYqxYpiBJu3QmT8sCMRVsyaThWavsIx0q0yAnxlcQEiGxhb9erWyXwPJ5hr5Hh_rqcqJ6mjUT14ExExFlCQqKWv01aGvg--&oauth_token_secret=90a6851d24e457be5ee8ab32009b8eb764347a24&oauth_expires_in=3600&oauth_session_handle=AGCf9FIAmE4BEP4lFWmxM7WgWtHGej5wuHUMisF1QBX1iaPpzbf2SkyrfCZL2sU-&oauth_authorization_expires_in=755372884&xoauth_yahoo_guid=VFOGIOOI3UIYD2WBH5GH3X62XY";
		 Map<String, String> map = splitQuery(query);
		 System.out.println(map);
	}
	private static Map<String, String> splitQuery(String query) {
		if(query == null || query.isEmpty())
			return Collections.EMPTY_MAP;
		
	    Map<String, String> query_pairs = new HashMap<String, String>();	     
	    String[] pairs = query.split("&");
	    for (String pair : pairs) {
	        int idx = pair.indexOf("=");
	        try {
				query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    return query_pairs;
	}
}
