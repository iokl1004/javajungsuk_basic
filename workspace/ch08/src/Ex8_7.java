class Ex8_7 {
	public static void main(String[] args) {
		//체크드 예외(예외처리 필수)
		try { //Exception과 그 자손은 반드시 예외처리를 해줘야 한다. (필수)
			throw new Exception(); //Exception을 고의로 발생시킨다. / Unhandled exception type Exception 에러 발생! 예외처리를 안했다!
		} catch(Exception e) {	

		}
		
		// RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다.
		throw new RuntimeException();
	}
}