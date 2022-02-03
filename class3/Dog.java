package class3;

class Owner{
	private Dog dog;
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}

public class Dog {
	private Owner owner;
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		if(this.owner != null)  //如果原先就有主人
			this.owner.setDog(null); //那么取消与原先主人的关联关系
		this.owner = owner; //建立狗和新主人的新关系
		
	}
	public static void main(String args[]) {
		Owner owner1 = new Owner();
		Owner owner2 = new Owner();
		Dog dog1 = new Dog();
		
		dog1.setOwner(owner1);
		dog1.setOwner(owner2);
	}
	
}
