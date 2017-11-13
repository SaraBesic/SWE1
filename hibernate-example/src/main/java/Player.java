

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Player")

public class Player {
	@Column(name = "Username")
	private String Username;
	@Id
	@Column(name = "PlayerID")
	private int PlayerID;
	@Column(name = "isWinner")
	private boolean isWinner;
	
	Player () {}

	public Player(String Username, boolean isWinner) {
		this.Username = Username;
		this.isWinner = isWinner;
	}
	
	
	
	
	


}
