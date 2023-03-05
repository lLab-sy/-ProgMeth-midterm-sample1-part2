package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
	protected int damage;

	public NormalRock(int damage) {
		this.setDamage(damage);
	}

	public int dealDamage(Zombie zombie) {
		if (zombie.getDefense() >= damage) {
			zombie.setDefense(zombie.getDefense() - damage);
			return 0;
		}
		int damageAfter = damage - zombie.getDefense();
		zombie.setHealth(zombie.getHealth() - damageAfter);
		return damageAfter;
	}

	@Override
	public String toString() {
		return "Normal Rock (" + damage + ")";
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = Math.max(0, damage);
	}
}
