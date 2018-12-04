package thiagodnf.sootparser.example.grocery.util;

public class UUIDUtil {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
