package dmk.springboot.web.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import dmk.springboot.web.model.Triple;

public class TriplesValidator implements Validator {
	Logger logger = LoggerFactory.getLogger(TriplesValidator.class);
			
	public boolean supports(Class clazz) {
		return Triple.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		Triple triple = (Triple) obj;

		ValidationUtils.rejectIfEmptyOrWhitespace(e, "subj", "subj.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "obj", "obj.empty");

		if (triple.getPred().isEmpty()) {
			e.rejectValue("pred", "predicate is empty");
		}
	}
}