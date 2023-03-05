package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock {
	private int damageOverTime;
	
	public PoisonRock(int damage, int damageOverTime) {
		super(damage);
		this.setDamageOverTime(damageOverTime);
	}
	
	@Override
	public int dealDamage(Zombie zombie) {
		int normalDamage = super.dealDamage(zombie);
		zombie.setDecay(zombie.getDecay()+damageOverTime);
		return normalDamage;
	}
	
	@Override
	public String toString() {
		return "Poison Rock (" + damage + ", DoT = " + damageOverTime + ")";
	}

	public int getDamageOverTime() {
		return damageOverTime;
	}

	public void setDamageOverTime(int damageOverTime) {
		this.damageOverTime = Math.max(0, damageOverTime);
	}

}
