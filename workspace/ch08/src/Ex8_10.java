//import java.io.*;
//
//public class Ex8_10 {
//	public static void main(String[] args) {
//		try {
//			File f = createFile("test3.txt");
//			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
//		} catch (Exception e) {
//			System.out.println(e.getMessage() +" 다시 입력해 주시기 바랍니다.");
//		}
//	} // main 메서드의 끝
//	
//	static File createFile(String fileName) throws Exception {
//		if (fileName==null || fileName.equals(""))
//			throw new Exception("파일 이름이 유효하지 않습니다.");
//		File f = new File(fileName);	// File클래스의 객체를 만든다.
//		//File 객체의 createNewFile 메서드를 이용해서 실제 파일을 생성한다.
//		f.createNewFile();
//		return f;	//생성된 객체의 참조를 반환한다.
//	} //createFile 메서드의 끝
//}	//class의 끝

import java.io.*;

public class Ex8_10 {
	public static void main(String[] args) {

			File f = createFile("");
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	} // main 메서드의 끝
	
	static File createFile(String fileName) {// throws Exception {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
		} catch(Exception e) {
			fileName = "제목없음.txt";
		}
		
		File f = new File(fileName);	// File클래스의 객체를 만든다.
		//File 객체의 createNewFile 메서드를 이용해서 실제 파일을 생성한다.
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;	//생성된 객체의 참조를 반환한다.
	} //createFile 메서드의 끝
}	//class의 끝
