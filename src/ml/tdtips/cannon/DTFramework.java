package ml.tdtips.cannon;

public class DTFramework {
	public static DTFramework getFramework() {
		return new DTFramework();
	}
	public static void init(int version) {
		System.out.println("[DEBUG] Debug mode active. Disable with CTRL+ALT_SHIFt+F10.");
		System.out.println("[DEBUG] Activating DevToolkit A+ Compiler Version " + version);
		System.out.println("[DEBUG]  Debug mode disabled. Disabled by user.");
	}

}
