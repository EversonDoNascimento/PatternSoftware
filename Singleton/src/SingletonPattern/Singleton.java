
package SingletonPattern;


import java.util.Objects;

public class Singleton {

	private int AppId;
	private String UserName;
	private String Language;
	private boolean Offline;
	private boolean AutoDLC;
	private int BuildId;
	private String DLCName;
	private boolean UpdateDB;
	private String Signature;
	private String WindowInfo;
	private String LVWindowInfo;
	private String ApplicationPath;
	private String WorkingDirectory;
	private boolean WaitForExit;
	private boolean NoOperation;

	private static Singleton uniqueInstance;

	private Singleton() {
		Arquivo.getArquivo();
		String conteudo = Arquivo.arquivo();
		this.setSingleton(conteudo);

	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}

		return uniqueInstance;

	}

	@Override
	public int hashCode() {
		return Objects.hash(AppId, ApplicationPath, AutoDLC, BuildId, DLCName, LVWindowInfo, Language, NoOperation,
				Offline, Signature, UpdateDB, UserName, WaitForExit, WindowInfo, WorkingDirectory);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Singleton other = (Singleton) obj;
		return AppId == other.AppId && Objects.equals(ApplicationPath, other.ApplicationPath)
				&& AutoDLC == other.AutoDLC && BuildId == other.BuildId && Objects.equals(DLCName, other.DLCName)
				&& Objects.equals(LVWindowInfo, other.LVWindowInfo) && Objects.equals(Language, other.Language)
				&& NoOperation == other.NoOperation && Offline == other.Offline
				&& Objects.equals(Signature, other.Signature) && UpdateDB == other.UpdateDB
				&& Objects.equals(UserName, other.UserName) && WaitForExit == other.WaitForExit
				&& Objects.equals(WindowInfo, other.WindowInfo)
				&& Objects.equals(WorkingDirectory, other.WorkingDirectory);
	}

	@Override
	public String toString() {
		return " AppId=" + AppId + "\n UserName=" + UserName + "\n Language=" + Language + "\n Offline=" + Offline
				+ "\n AutoDLC=" + AutoDLC + "\n BuildId=" + BuildId + "\n DLCName=" + DLCName + "\n UpdateDB="
				+ UpdateDB + "\n Signature=" + Signature + "\n WindowInfo=" + WindowInfo + "\n LVWindowInfo="
				+ LVWindowInfo + "\n ApplicationPath=" + ApplicationPath + "\n WorkingDirectory=" + WorkingDirectory
				+ "\n WaitForExit=" + WaitForExit + "\n NoOperation=" + NoOperation;
	}

	public void setSingleton(String conteudo) {
		String arrayConteudo[] = conteudo.split("\n");
		String temp = "";

		for (String c : arrayConteudo) {

			temp = c.substring(0, c.indexOf("="));

			switch (temp) {
			case "nullAppId":
				this.setAppId(Integer.parseInt(c.substring(c.indexOf("=") + 1, c.length())));
				temp = "";
				break;
			case "UserName":
				this.setUserName(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "Language":
				this.setLanguage(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "Offline":
				String num = c.substring(c.indexOf("=") + 1, c.length());
				if (Integer.parseInt(num) == 1) {
					this.setOffline(true);
				} else {
					this.setOffline(false);
				}
				temp = "";
				break;
			case "AutoDLC":
				String num2 = c.substring(c.indexOf("=") + 1, c.length());
				if (Integer.parseInt(num2) == 1) {
					this.setAutoDLC(true);
				} else {
					this.setAutoDLC(false);
				}
				temp = "";
				break;
			case "BuildId":
				String num3 = c.substring(c.indexOf("=") + 1, c.length());
				this.setBuildId(Integer.parseInt(num3));
				temp = "";
				break;
			case "DLCName":
				this.setDLCName(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "UpdateDB":
				String num4 = c.substring(c.indexOf("=") + 1, c.length());
				if (Integer.parseInt(num4) == 1) {
					this.setUpdateDB(true);
				} else {
					this.setUpdateDB(false);
				}
				temp = "";
				break;
			case "Signature":
				this.setSignature(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "WindowInfo":
				this.setWindowInfo(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "LVWindowInfo":
				this.setLVWindowInfo(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "ApplicationPath":
				this.setApplicationPath(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "WorkingDirectory":
				this.setWorkingDirectory(c.substring(c.indexOf("=") + 1, c.length()));
				temp = "";
				break;
			case "WaitForExit":
				String num5 = c.substring(c.indexOf("=") + 1, c.length());
				if (Integer.parseInt(num5) == 1) {
					this.setWaitForExit(true);
				} else {
					this.setWaitForExit(false);
				}
				temp = "";
				break;
			case "NoOperation":
				String num6 = c.substring(c.indexOf("=") + 1, c.length());
				if (Integer.parseInt(num6) == 1) {
					this.setNoOperation(true);
				} else {
					this.setNoOperation(false);
				}
				temp = "";
				break;
			default:
				break;

			}
			;

		}
		;
	};

	public int getAppId() {
		return AppId;
	}

	public void setAppId(int appId) {
		AppId = appId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public boolean isOffline() {
		return Offline;
	}

	public void setOffline(boolean offline) {
		Offline = offline;
	}

	public boolean isAutoDLC() {
		return AutoDLC;
	}

	public void setAutoDLC(boolean autoDLC) {
		AutoDLC = autoDLC;
	}

	public int getBuildId() {
		return BuildId;
	}

	public void setBuildId(int buildId) {
		BuildId = buildId;
	}

	public String getDLCName() {
		return DLCName;
	}

	public void setDLCName(String dLCName) {
		DLCName = dLCName;
	}

	public boolean isUpdateDB() {
		return UpdateDB;
	}

	public void setUpdateDB(boolean updateDB) {
		UpdateDB = updateDB;
	}

	public String getSignature() {
		return Signature;
	}

	public void setSignature(String signature) {
		Signature = signature;
	}

	public String getWindowInfo() {
		return WindowInfo;
	}

	public void setWindowInfo(String windowInfo) {
		WindowInfo = windowInfo;
	}

	public String getLVWindowInfo() {
		return LVWindowInfo;
	}

	public void setLVWindowInfo(String lVWindowInfo) {
		LVWindowInfo = lVWindowInfo;
	}

	public String getApplicationPath() {
		return ApplicationPath;
	}

	public void setApplicationPath(String applicationPath) {
		ApplicationPath = applicationPath;
	}

	public String getWorkingDirectory() {
		return WorkingDirectory;
	}

	public void setWorkingDirectory(String workingDirectory) {
		WorkingDirectory = workingDirectory;
	}

	public boolean isWaitForExit() {
		return WaitForExit;
	}

	public void setWaitForExit(boolean waitForExit) {
		WaitForExit = waitForExit;
	}

	public boolean isNoOperation() {
		return NoOperation;
	}

	public void setNoOperation(boolean noOperation) {
		NoOperation = noOperation;
	}

	public Singleton getUniqueInstance() {
		return uniqueInstance;
	}

	public static void setUniqueInstance(Singleton uniqueInstance) {
		Singleton.uniqueInstance = uniqueInstance;
	}

	
}
