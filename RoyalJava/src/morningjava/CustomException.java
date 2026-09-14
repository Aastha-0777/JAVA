//package morningjava;
//
//import java.util.Date;
//
//class CustomExceptionMsg extends Exception{
//	
//	public CustomExceptionMsg(String msg) {
//
//		super(msg);
//
//	}
//	
//}
//
//public class CustomException {
//	
//	@SuppressWarnings("deprecation")
//	public static void main(String[] args) {
//		
//		try {
//			
//
//			Date dObj = new Date();
//			
//			String date = dObj.toString();
//			
//			System.out.println(date);
//			
//			
//		
//			if( && date.subSequence(11, 2) == "05") {
//				
//				throw new CustomExceptionMsg("Transanction is Clossed!!");
//				
//			}else {
//				
//				System.out.println("Transaction Successfull!!");
//			
//			}
//			
//			
//		}catch (CustomExceptionMsg c) {
//		
//			c.getMessage();
//
//		}
//			
//	}
//
//}
