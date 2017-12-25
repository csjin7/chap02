package chap06;

public class ExitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setSecurityManager(new SecurityManager() {
//			@Override
//			public void checkExit(int status) {
//				if (status != 5) {
//					throw new SecurityException();
//					
//				}
//				
//			}
//			
//		});
		
		String javahome = System.getenv("JAVA_HOME");
		System.out.println(javahome);
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//			
//			try {
//				System.exit(i);
//			} catch (Exception e) {
//
//			}
//			
//		}

		
		
	}

}
