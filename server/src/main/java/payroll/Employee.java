package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {

	private @Id @GeneratedValue Long id;
	private String name;
	private String role;

	Employee() {}
	//me gusta el queso y el chori y la mostaza y asadito y fernandito
	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
}
