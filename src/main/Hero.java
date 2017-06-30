package main;

public class Hero implements Cloneable{

	String name;
	int hp;
	String sword;

	@Override
	public Hero clone(){
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;

		return result;
	}

}
