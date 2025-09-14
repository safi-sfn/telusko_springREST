package in.inxod.touristBackend.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.inxod.touristBackend.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetail> handleTouristException(TouristNotFoundException tnf){
		
		ErrorDetail error = new ErrorDetail(tnf.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetail>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetail> handleException(Exception tnf){
		
		ErrorDetail error = new ErrorDetail(tnf.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetail>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
