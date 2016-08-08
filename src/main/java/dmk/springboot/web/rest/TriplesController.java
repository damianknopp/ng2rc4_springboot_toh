package dmk.springboot.web.rest;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dmk.springboot.web.model.Triple;
import dmk.springboot.web.validation.TriplesValidator;

@RestController
public class TriplesController {
	protected Logger logger = LoggerFactory.getLogger(TriplesController.class);

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    binder.setValidator(new TriplesValidator());
	}
	
	@RequestMapping(value = "/triple/subj/{subj}/pred/{pred}/obj/{obj}",
			method = RequestMethod.GET, 
			consumes = { MediaType.ALL_VALUE },
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Triple spo(@PathVariable String subj, @PathVariable String obj,
			@PathVariable String pred) {
		return new Triple().setSubj(subj).setObj(obj).setPred(pred);
	}

	@RequestMapping(value = "/triple", 
			method = RequestMethod.POST,
			consumes = { MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Triple spo(final @RequestBody @Valid Triple triple) {
		return triple;
	}

}