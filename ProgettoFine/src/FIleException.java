
	public class FlleException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String Mess = "";
		public FileException (String M)	{
			this.Mess=M;
		}
		public String getMess(){
			return Mess;
		}
	}
