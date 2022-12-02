package Test_12_02;


public class ShopProduct {
	Product[] products = new Product[3];
	
	ShopProduct() {
		products[0] = new Product(1,"블랜딩 커피",5000);
		products[1] = new Product(2,"파나마 게이샤",15000);
		products[2] = new Product(3,"이디오피아 커피",10000);
	}
	
	public void printProduct() {
		for (int i = 0 ; i < products.length; i++) {
			System.out.println("상품코드 : " + products[i].getProductID() +
							   " 상품이름 : " + products[i].getProductName() +
							   " 가격 : " + products[i].getPrice() );
		}
	}



}
