
public static class Singleton {
	
		private int Appld;
		private string UserName;
		private string Language;
		private boolean Offline;
		private boolean AutoDLC;
		private int Buildld;
		private string DLCName;
		private boolean UpdateDB;
		private string Signature;
		private string WindowInfo;
		private string LVWindowInfo;
		private string AplicationPath;
		private string WorkingDirectory;
		private boolean WaitForExit;
		private boolean NoOperation;
		
		private static Singleton uniqueInstance;
		
		private static Singleton() {
			this.UserName = 1649240;
			this.UserName = "elamigos";
			this.Language = "Brazilian";
			this.Offline = false;
			this.AutoDLC = false;
			this.Buildld = 10547147;
			this.DLCName = "Returnal Pre-Purchase Entilement";
			
			
		}
		
		public static Singleton getSinglenton() {
			if(uniqueInstance == null) {
				new Singleton();
			}
			
			return uniqueInstance;
		}
		

	


}
