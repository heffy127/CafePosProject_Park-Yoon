package pos;

public class CoffeeInfo {	// 메뉴의 공통된 속성들을 클래스라는 틀로 묶어둠
	String name;
	int price;
	int num;
	int row;
	
	public CoffeeInfo(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
}
