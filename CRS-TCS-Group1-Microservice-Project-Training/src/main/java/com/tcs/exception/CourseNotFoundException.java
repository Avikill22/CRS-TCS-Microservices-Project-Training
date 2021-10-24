package com.tcs.exception;


public class CourseNotFoundException extends Exception{
		private String courseId;
		
		public CourseNotFoundException(String courseCode)
		{	
			this.courseId = courseId;
		}

		/**
		 * Getter function for course id
		 * @return
		 */
		public String getCourseId()
		{
			return courseId;
		}
		

		/**
		 * Message returned when exception is thrown
		 */
		@Override
		public String getMessage() 
		{
			return "Course with courseCode: " + courseId + " not found.";
		}
	}
