package com.devsuperior.dslearnbds.entities;

<<<<<<< HEAD
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
=======
import java.io.Serializable;
import java.time.Instant;
>>>>>>> da3e6e6f30da63e05fbe87f55fe5492c169c3999

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
=======
>>>>>>> da3e6e6f30da63e05fbe87f55fe5492c169c3999
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

@Entity
@Table(name = "tb_enrollment")
<<<<<<< HEAD
public class Enrollment {

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;

=======
public class Enrollment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();	
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
>>>>>>> da3e6e6f30da63e05fbe87f55fe5492c169c3999
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment;
	private boolean available;
	private boolean onlyUpdate;
<<<<<<< HEAD

	@ManyToMany(mappedBy = "enrollmentsDone")
	private Set<Lesson> lessonsDone = new HashSet<>();
	
	@OneToMany(mappedBy = "enrollment")
	private List<Deliver> deliveries = new ArrayList<>();
=======
>>>>>>> da3e6e6f30da63e05fbe87f55fe5492c169c3999
	
	public Enrollment() {
	}

	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available,
			boolean onlyUpdate) {
		super();
		id.setUser(user);
		id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

	public User getStudent() {
		return id.getUser();
	}
<<<<<<< HEAD
	
	public void setStudent(User user) {
		id.setUser(user);
	}

	public Offer getOffer() {
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}
	
=======

	public void setStudent(User user) {
		this.id.setUser(user);
	}
	
	public Offer getOffer() {
		return id.getOffer();
	}

	public void setOffer(Offer offer) {
		this.id.setOffer(offer);
	}

>>>>>>> da3e6e6f30da63e05fbe87f55fe5492c169c3999
	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
<<<<<<< HEAD

	public List<Deliver> getDeliveries() {
		return deliveries;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
=======
>>>>>>> da3e6e6f30da63e05fbe87f55fe5492c169c3999
}
