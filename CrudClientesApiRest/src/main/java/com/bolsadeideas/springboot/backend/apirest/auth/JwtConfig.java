package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "clave.secreta.1245678";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEogIBAAKCAQEA4OSemE7omTB9g7cQT9WJkr4jOwDU5pnlNOHrkVwIDqDKkfxJ\r\n"
			+ "dDQapOhVhmoohsb8xu3eebQ5+Fp/srS16q0LSNkPs6CmGXQOzsOxJd5Y+tJ1VR5R\r\n"
			+ "D/P2deDkcihEyORfItgDmzGv5C25UeCawxJW0rhwyU6E/WqsZQpprzcm2lWC6gwx\r\n"
			+ "cczLnlUKBXk8cQ2AJpOUD5OVGwSVBseJtj7jlVv+J7eqMKqhUKHwWVAE9cLIVdEI\r\n"
			+ "ecgoEdaqeh3L5CXVDj/KMbCWQwksUeTcfUjWszOcxL+f3K0e9dgoLfKz62vf2eZa\r\n"
			+ "py1uj9Vc8OFai4wgXxBh0AwjqhQFQ5oJ2/+9dQIDAQABAoIBABqn/oRfFgLSVI5A\r\n"
			+ "LJbJ4Lyb/OEJgDK1Gw3hmWJpXisds+UJ2ksDwgS55SlBe/w9qciKeUxDqHtffrNX\r\n"
			+ "6Bgg2q2PzOSlrgpmTzsCxwSODk3slCu6pDEX4aanOWyuiTimmQAwSn0iro6FPOoP\r\n"
			+ "jUiB6/ieFABIZksDUdvIGC7Egr5uG2k8B/WLQJbH7z2r5v8ai4K3pZq2t/yW2KP7\r\n"
			+ "cOXxFmhbuDdu/1iVI2oCqfK7fAgnADL86UVq0iKV6nJP3sXwg/PWk1ph2az6E/U/\r\n"
			+ "xMxX8wlQ9zyUUKKfKfif6GTSURsfkJ9EAPSO1zcXslCQvc5K418gG6ZUhyYbkBn2\r\n"
			+ "W7dkWQECgYEA9UzHYUOj2nDIT1CzBYQ3o4c1E/tQISm/YRk4bRE2bM9DNwkwXH2H\r\n"
			+ "pGv++YuVyFOR9MBM73xVSruIMiCVkoJ3eOBkeP5cFleydsYjV4d9gDqMtQT7mANP\r\n"
			+ "UXGBghw8ZJzbvL+Yo7/TyA4TyJmDHjia/GPPDfRKypbSbq9rjQtYBM0CgYEA6rP1\r\n"
			+ "8ZyFixR8cs9MhSD8iBUdXoSyn1XB/6IFl3U/bC4qr9CD6pUyaUeRK1rc0K6+64Kg\r\n"
			+ "9VI1L64ZT72kIoQ9/BGQNG56mDaeIFg44ie7Ax4W771GoIj2CeYW0Bi9wpq8CuLJ\r\n"
			+ "F+gl2fxjJd12i3MVeAShuv7QdXZMMWuhg3r320kCgYBP97DD954SF1Rl7wP9l2Xg\r\n"
			+ "DLL0CajMtuRqDiPEAqmAfW0HIxq9/DpdEsvzpFq3DO93H721EQ5pJ4u188NvGNND\r\n"
			+ "97spapqwufQ3Hk7lOQlj5TJ7zN0MaH/SKDO1K+lQT4afGML1FxM+k8BFVC5XitKT\r\n"
			+ "1yHoBazgMJz3cn6YY4tVPQKBgCBI5wD4TepmxAOq/lSlx/cUKHkS+dsvGcOHTwuZ\r\n"
			+ "hkLkStzqaur+4PNYc+Cp3AwcrYiJ7IgyabyIT1UHuidBV6Fv7Q05UUXU5YV/fTum\r\n"
			+ "yXPRVMhfmfKFRIryCptPe/LkBA/fSFgwh9xnemAACcl+6CodQP4PBS/TOQHnU01Z\r\n"
			+ "wfR5AoGASZ8FzmKWOm2xlSUne8N2jQ346oQhVj9jDEwpcZYhPfqKpwKSj+g8UCXY\r\n"
			+ "PBKi0LFmQePzqlJwy53nZ7pXz3yBtMhHBfOKpCrxqg6b3PwVdjMMkt0lMGjOJOnS\r\n"
			+ "sG/P4rzQCFiiGYEzsKiJtD+Q0Jzltx56Jpe/PqT5YDUuBXARQgc=\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4OSemE7omTB9g7cQT9WJ\r\n"
			+ "kr4jOwDU5pnlNOHrkVwIDqDKkfxJdDQapOhVhmoohsb8xu3eebQ5+Fp/srS16q0L\r\n"
			+ "SNkPs6CmGXQOzsOxJd5Y+tJ1VR5RD/P2deDkcihEyORfItgDmzGv5C25UeCawxJW\r\n"
			+ "0rhwyU6E/WqsZQpprzcm2lWC6gwxcczLnlUKBXk8cQ2AJpOUD5OVGwSVBseJtj7j\r\n"
			+ "lVv+J7eqMKqhUKHwWVAE9cLIVdEIecgoEdaqeh3L5CXVDj/KMbCWQwksUeTcfUjW\r\n"
			+ "szOcxL+f3K0e9dgoLfKz62vf2eZapy1uj9Vc8OFai4wgXxBh0AwjqhQFQ5oJ2/+9\r\n"
			+ "dQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
