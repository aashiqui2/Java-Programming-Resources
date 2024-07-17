package UserDefined;
public class LowAttendanceException extends RuntimeException {
//javac -d . LowAttendanceException.java
	public LowAttendanceException(String msg) {
		// System.out.println(msg);
		System.err.println(msg);
	}

	public LowAttendanceException() {
		System.out.println("Technical ISSUE OCCURED");
		
	}
	// throwable
	// exception
	// RuntimeException
	// throw
	public void allowForExams(int attendance) {
		if (attendance >= 75) {
			System.out.println("permitted students to join");
		} else {
			try {
				// LowAttendanceException lae=new LowAttendanceException();
				throw new LowAttendanceException();
				// Anonymous Object
			} catch (LowAttendanceException ll) {
				System.out.println("Check Attendance");
			}

		}
	}

}
