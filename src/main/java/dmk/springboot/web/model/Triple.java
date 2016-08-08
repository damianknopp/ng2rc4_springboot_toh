package dmk.springboot.web.model;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Triple {

	protected String subj;
	protected String obj;
	protected String pred;
	protected List<String> provenence;

	public Triple() {
		super();
	}

	public String getSubj() {
		return subj;
	}

	public Triple setSubj(String subj) {
		this.subj = subj;
		return this;
	}

	public String getObj() {
		return obj;
	}

	public Triple setObj(String obj) {
		this.obj = obj;
		return this;
	}

	public String getPred() {
		return pred;
	}

	public Triple setPred(String pred) {
		this.pred = pred;
		return this;
	}

	public List<String> getProvenence() {
		return provenence;
	}

	public Triple setProvenence(List<String> provenence) {
		this.provenence = provenence;
		return this;
	}

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

}